public class Discount2 {
    public static void main(String[] args) {
        int p, q;
        p = 10000;
        q = halve(p);
        System.out.println("���̒l�i��" + p + "�~�Ȃ�A���z����" + q + "�~�ɂȂ�܂��B");
    }
    public static int halve(int n) {
        return n / 2;
    }
}
