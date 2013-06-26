import java.util.*;

public class PrintfTest {
    public static void main(String[] args) {
        int x = 12345;
        int y = 67;
        int z = -890;
        String s = "Hello";

        // 2005-09-07 08:30:59
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 9 - 1, 7, 8, 30, 59);

        System.out.printf("x = %d, y = %d, z = %d�i10�i���\���j%n", x, y, z);
        System.out.printf("x = %#x, y = %#x, z = %#x�i16�i���\���j%n", x, y, z);

        System.out.printf("%-10d�~�i10���ō��񂹁j%n", x);
        System.out.printf("%+-10d�~�i10���ō��񂹂ŕ����t���j%n", x);
        System.out.printf("%10d�~�i10���ŉE�񂹁j%n", x);
        System.out.printf("%+10d�~�i10���ŉE�񂹂ŕ����t���j%n", x);
        System.out.printf("%,10d�~�i10���ŉE�񂹂ŋ�؂�t���j%n", x);

        System.out.printf("%tF�i���t�j%n", cal);
        System.out.printf("%tT�i�����j%n", cal);
        System.out.printf("%ta�i�j���j%n", cal);
        System.out.printf("%tF (%<ta) %<tT �i�܂Ƃ߂����t�j%n", cal);
    }
}
