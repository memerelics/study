public class MethodTest3 {
    public static void getYourName(String[] args) {
        args[0] = "����";
        args[1] = "�_";
    }
    public static void main(String[] args) {
        String[] s = new String[2];
        getYourName(s);
        System.out.println("������" + s[0]);
        System.out.println("���O��" + s[1]);
    }
}
