public class SelectGreeting {
    public static void main(String[] args) {
        String[] message ???

        ???

        if (args.length != 1) {
            System.out.println("�g�����Fjava SelectGreeting �ԍ�");
            System.exit(0);
        }
        int num = Integer.parseInt( ??? );
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("�ԍ���0�`" + ??? + "�͈̔͂Ŏw�肵�Ă��������B");
        }
    }
}
