import java.io.*;

public class Kasa3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("�~���m������͂��Ă��������B");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            System.out.println("�~���m����" + n + "%�ł��B");
            if (n < 0 || 100 < n) {
                System.out.println("�~���m���� 0 �` 100 �̊Ԃł���B");
            } else if (n >= 50) {
                System.out.println("�P��Y�ꂸ�ɂˁB");
            } else {
                System.out.println("�P�͂���܂���B");
            }
            System.out.println("�����Ă�����Ⴂ�B");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("�����̌`��������������܂���B");
        }
    }
}
