public class GoodBankTest extends Thread {
    GoodBank bank;
    public GoodBankTest(GoodBank bank) {
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
        GoodBank bank = new GoodBank();   // GoodBank�𐶐�
        new GoodBankTest(bank).start();
        new GoodBankTest(bank).start();
    }
}
