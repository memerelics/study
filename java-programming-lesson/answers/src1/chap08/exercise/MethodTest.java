public class MethodTest {
    /* "����" �� "�_" ��2�̕������Ԃ����\�b�h�i�H�j */
    public static void getYourName(String myoji, String namae) {
        myoji = "����";
        namae = "�_";
    }
    public static void main(String[] args) {
        String x;
        String y;
        getYourName(x, y);
        System.out.println("������" + x);
        System.out.println("���O��" + y);
    }
}
