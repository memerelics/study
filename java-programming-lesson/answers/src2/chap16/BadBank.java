public class BadBank {
    // �a���c��
    private int value = 0;
    // �a������E�����o��
    public void addMoney(int money) {
        // ���ݎc����ۑ�
        int currentValue = value;
        // �󋵂�\��
        System.out.println(Thread.currentThread() + "�� addMoney �ɓ���܂����B");
        // ���ݎc����ύX
        value += money;
        // �������Ȃ����ǂ����`�F�b�N
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "�Ŗ������������܂����I");
            System.exit(-1);
        }
        // �󋵂�\��
        System.out.println(Thread.currentThread() + "�� addMoney ����o�܂����B");
    }
}
