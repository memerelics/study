import java.io.*;

public class WeekArray {
    public static void main(String[] args) {
        String[] week = {
            "���j��",
            "���j��",
            "�Ηj��",
            "���j��",
            "�ؗj��",
            "���j��",
            "�y�j��",
        };
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0�`6�̐�������͂��Ă��������B�Ή������j����\�����܂��B");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (0 <= n && n < 7) {
                System.out.println(week[n]);
            } else {
                System.out.println("0�`6�͈̔͂œ��͂��Ă�������");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("��������͂��Ă�������");
        }
    }
}
