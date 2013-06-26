public class JoinTest extends Thread {
    public static void main(String[] args) {
        JoinTest th = new JoinTest();
        System.out.println("main:�͂���");
        th.start();
        System.out.println("main:�I���҂��ɓ���");
        try {
            th.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main:�����");
    }
    public void run() {
        System.out.println("run:�X���b�h���s�J�n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("run:�X���b�h���s�I��");
    }
}
