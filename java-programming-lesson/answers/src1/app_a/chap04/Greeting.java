import java.io.*;

public class Greeting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("���݂̎�������͂��Ă��������i�u���v�݂̂ł��������ł��j�B");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (0 <= n && n <= 11) {
                System.out.println("���͂悤�������܂�");
            } else if (n == 12) {
                System.out.println("�����ł�");
            } else if (13 <= n && n <= 18) {
                System.out.println("����ɂ���");
            } else if (19 <= n && n <= 23) {
                System.out.println("����΂��");
            } else {
                System.out.println("�����͈̔͂��z���Ă��܂�");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("�����̌`��������������܂���B");
        }
    }
}
