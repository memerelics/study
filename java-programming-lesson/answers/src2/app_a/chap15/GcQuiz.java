class ClassA {
    public static ClassA last = null;
    public String name;
    public ClassA(String name) {
        this.name = name;
        last = this;
        // ���܂ꂽ�Ƃ��Ƀ��b�Z�[�W��\������
        System.out.println(this + "�����܂�܂����B");
    }
    public String toString() {
        return "[" + name + "]";
    }
}

class ClassB extends ClassA {
    public ClassA friend;
    public ClassB(String name) {
        super(name);
    }
    public ClassB(String name, ClassA friend) {
        super(name);
        this.friend = friend;
    }
    public String toString() {
        return "[" + name + ", " + friend + "]";
    }
}

class GcQuiz {
    public static ClassA q = new ClassA("�W�}�C�}");
    public ClassA r = new ClassA("���x�b�J");
    public static void main(String[] args) {
        ClassA a = new ClassA("�~�g��");
                                            // a��"�~�g��"
        ClassA b = new ClassA("�g��");
                                            // b��"�g��"
        ClassA c = new ClassA("���y�b�g");
                                            // c��"���y�b�g"
        ClassB[] arrayA = new ClassB[4];    
        b = c;
                                            // "�g��"�̓K�[�x�b�W�i��1�j
                                            // b��"���y�b�g"
                                            // c��"���y�b�g"
        for (int i = 0; i < 4; i++) {
            arrayA[i] = new ClassB("��" + i);
        }
                                            // arrayA[0]��"��0"
                                            // arrayA[1]��"��1"
                                            // arrayA[2]��"��2"
                                            // arrayA[3]��"��3"
        arrayA[3].friend = arrayA[3];
                                            // arrayA[3]��"��3"
                                            // "��3"��friend��"��3"
        arrayA[0] = arrayA[1];
                                            // "��0"�̓K�[�x�b�W�i��2�j
                                            // arrayA[0]��"��1"
                                            // arrayA[1]��"��1"
        c = arrayA[2];
                                            // b��"���y�b�g"
                                            // arrayA[2]��"��2"
                                            // c��"��2"
        arrayA[1] = null;
                                            // arrayA[0]��"��1"
        ClassA d = arrayA[0];
                                            // arrayA[0]��"��1"
                                            // d��"��1"
        ClassB[] arrayB = new ClassB[4];    
        arrayB[0] = new ClassB("�t���v�V�[", new ClassA("��l�Y�~"));
                                            // arrayB[0]��"�t���v�V�["
                                            // "�t���v�V�["��friend��"��l�Y�~"
        arrayB[1] = new ClassB("���v�V�[", new ClassA("�i�g�L��"));
                                            // arrayB[1]��"���v�V�["
                                            // "���v�V�["��friend��"�i�g�L��"
        arrayB[2] = new ClassB("�J�g���e�[��", c);
                                            // arrayB[2]��"�J�g���e�[��"
                                            // arrayA[2]��"��2";
                                            // c��"��2";
                                            // "�J�g���e�[��"��friend��"��2"
        arrayB[3] = new ClassB("�s�[�^�[", new ClassA("�x���W���~��"));
                                        // arrayB[3]��"�s�[�^�["
                                        // "�s�[�^�["��friend��"�x���W���~��"
        arrayA = null;  // ������B
                                            // d��"��1"
                                            // c��"��2"
                                            // "�J�g���e�[��"��friend��"��2"
                                            // "��3"�̓K�[�x�b�W�i��3�j
        arrayB[0].friend = null;
                                            // "��l�Y�~"�̓K�[�x�b�W�i��4�j
        arrayB[1] = null;   // ������C
                                            // "���v�V�["�̓K�[�x�b�W�i��5�j
                                            // "�i�g�L��"���K�[�x�b�W�i��6�j
        arrayB[2] = null;
                                            // "�J�g���e�[��"�̓K�[�x�b�W�i��7�j
                                            // c��"��2"
        ClassB e = new ClassB("���[�V�[", new ClassA("�e�B�M�["));
                                            // e��"���[�V�["
                                            // e.friend��"�e�B�M�["
        e = null;
                                            // ClassA.last��"���[�V�[" �i��8�j
                                            // "���[�V�["��friend��"�e�B�M�["
        // ��
        System.gc();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("arrayA = " + arrayA);
        System.out.println("arrayB[0] = " + arrayB[0]);
        System.out.println("arrayB[1] = " + arrayB[1]);
        System.out.println("arrayB[2] = " + arrayB[2]);
        System.out.println("arrayB[3] = " + arrayB[3]);
        System.out.println("ClassA.last = " + ClassA.last);
        System.out.println("GcQuiz.q = " + GcQuiz.q);
    }
}
