class SelectGreeting {
    public static void main(String[] args) {
        String[] message = {            
            "���͂悤�I",            
            "����ɂ��́I",             
            "����΂�́I",          
        };                              
        if (args.length != 1) {
            System.out.println("�g�����Fjava SelectGreeting �ԍ�");
            System.exit(0);
        }
        int num = Integer.parseInt(args[0]);
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("�ԍ���0�`" + (message.length - 1) + "�͈̔͂Ŏw�肵�Ă��������B");

        }
    }
}
