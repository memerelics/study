public class Heikin5 {
    public static void main(String[] args) {
        int[] ten = { 63, 90, 75, 45, 81 };
        int sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum += ten[i];
        }
        double heikin = (double)sum / ten.length;
        System.out.println("�����" + ten[0] + "�_");
        System.out.println("���w��" + ten[1] + "�_");
        System.out.println("�p���" + ten[2] + "�_");
        System.out.println("���Ȃ�" + ten[3] + "�_");
        System.out.println("�Љ��" + ten[4] + "�_");
        System.out.println("���ϓ_��" + heikin + "�_");
    }
}
