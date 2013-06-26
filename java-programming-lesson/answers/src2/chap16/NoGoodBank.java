public class NoGoodBank {
    // �a���c��
    private int value = 0;
    // ���s���`�F�b�N�H
    private boolean busy = false;
    // �a������E�����o��
    public void addMoney(int money) {
        while (busy) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        // ���s��
        busy = true;
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
        // ���s���ł͂Ȃ�
        busy = false;
    }
}
