public class BadBankTest extends Thread {
    BadBank bank;
    public BadBankTest(BadBank bank) {
        this.bank = bank;
    }
    public void run() {
        while (true) {
            // 100�~�a������
            bank.addMoney(100);
            // 100�~�����o��
            bank.addMoney(-100);
        }
    }
    public static void main(String[] args) {
        BadBank bank = new BadBank();   // BadBank�𐶐�
        new BadBankTest(bank).start();
        new BadBankTest(bank).start();
    }
}
