import java.io.*;

public class HowOldAreYou2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            // 1�l��
            System.out.println("1�l�ڂ̖��O����͂��Ă��������B");
            String name1 = reader.readLine();
            System.out.println(name1 + "����̔N�����͂��Ă��������B");
            line = reader.readLine();
            int age1 = Integer.parseInt(line);
            // 2�l��
            System.out.println("2�l�ڂ̖��O����͂��Ă��������B");
            String name2 = reader.readLine();
            System.out.println(name2 + "����̔N�����͂��Ă��������B");
            line = reader.readLine();
            int age2 = Integer.parseInt(line);
            // ����
            double average = (age1 + age2) / 2.0;
            System.out.println(name1 + "�����" + name2 + "����̔N��̕��ς�" + average + "�ł��B");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("�N�����������܂���B");
        }
    }
}
