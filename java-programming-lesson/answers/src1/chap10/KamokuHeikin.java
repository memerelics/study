public class KamokuHeikin {
    public static void main(String[] args) {
        Kamoku[] kamoku = {
            new Kamoku("����", 63),
            new Kamoku("���w", 90),
            new Kamoku("�p��", 75),
            new Kamoku("����", 45),
            new Kamoku("�Љ�", 81),
        };
        int sum = 0;
        for (int i = 0; i < kamoku.length; i++) {
            System.out.println(kamoku[i]);
            sum += kamoku[i].tensuu;
        }
        double heikin = (double)sum / kamoku.length;
        System.out.println("���ϓ_��" + heikin + "�_");
    }
}
