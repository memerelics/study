public class Heikin1 {
    public static void main(String[] args) {
        int kokugo, suugaku, eigo;
        double heikin;

        kokugo = 63;
        suugaku = 90;
        eigo = 75;
        heikin = (kokugo + suugaku + eigo) / 3.0;

        System.out.println("�����" + kokugo + "�_");
        System.out.println("���w��" + suugaku + "�_");
        System.out.println("�p���" + eigo + "�_");
        System.out.println("���ϓ_��" + heikin + "�_");
    }
}
