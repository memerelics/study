public class Heikin3 {
    public static void main(String[] args) {
        int[] ten;
        int sum;
        double heikin;

        ten = new int[3];
        ten[0] = 63;
        ten[1] = 90;
        ten[2] = 75;
        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + ten[i];
        }
        heikin = sum / 3.0;

        System.out.println("�����" + ten[0] + "�_");
        System.out.println("���w��" + ten[1] + "�_");
        System.out.println("�p���" + ten[2] + "�_");
        System.out.println("���ϓ_��" + heikin + "�_");
    }
}
