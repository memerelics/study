public class Heikin4 {
    public static void main(String[] args) {
        int[] ten;
        int sum;
        double heikin;

        ten = new int[5];
        ten[0] = 63;
        ten[1] = 90;
        ten[2] = 75;
        ten[3] = 45;
        ten[4] = 81;
        sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum = sum + ten[i];
        }
        heikin = (double)sum / ten.length;

        System.out.println("�����" + ten[0] + "�_");
        System.out.println("���w��" + ten[1] + "�_");
        System.out.println("�p���" + ten[2] + "�_");
        System.out.println("���Ȃ�" + ten[3] + "�_");
        System.out.println("�Љ��" + ten[4] + "�_");
        System.out.println("���ϓ_��" + heikin + "�_");
    }
}
