public class MethodTest1 {
    public static String[] getYourName() {
        String[] myoji_namae = { "����", "�_" };
        return myoji_namae;
    }
    public static void main(String[] args) {
        String[] s = getYourName();
        System.out.println("������" + s[0]);
        System.out.println("���O��" + s[1]);
    }
}
