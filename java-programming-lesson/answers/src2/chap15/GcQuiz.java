class ClassA {
    public static ClassA last = null;
    public String name;
    public ClassA(String name) {
        this.name = name;
        last = this;
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

public class GcQuiz {
    public static ClassA q = new ClassA("�W�}�C�}");
    public ClassA r = new ClassA("���x�b�J");
    public static void main(String[] args) {
        ClassA a = new ClassA("�~�g��");
        ClassA b = new ClassA("�g��");
        ClassA c = new ClassA("���y�b�g");
        ClassB[] arrayA = new ClassB[4];   
        b = c;
        for (int i = 0; i < 4; i++) {
            arrayA[i] = new ClassB("��" + i);
        }
        arrayA[3].friend = arrayA[3];
        arrayA[0] = arrayA[1];
        c = arrayA[2];
        arrayA[1] = null;
        ClassA d = arrayA[0];
        ClassB arrayB[] = new ClassB[4];
        arrayB[0] = new ClassB("�t���v�V�[", new ClassA("��l�Y�~"));
        arrayB[1] = new ClassB("���v�V�[", new ClassA("�i�g�L��"));
        arrayB[2] = new ClassB("�J�g���e�[��", c);
        arrayB[3] = new ClassB("�s�[�^�[", new ClassA("�x���W���~��"));
        arrayA = null;
        arrayB[0].friend = null;
        arrayB[1] = null;
        arrayB[2] = null;
        ClassB e = new ClassB("���[�V�[", new ClassA("�e�B�M�["));
        e = null;
        // �������̎��_�ŎQ�Ƃ���Ă���C���X�^���X�͉����B
    }
}
