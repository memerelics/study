import java.io.*;

public class HowOldAreYou {
    public static void main(String[] args) {
        System.out.println("���Ȃ��̖��O����͂��Ă��������B");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            System.out.println(line + "����A����ɂ��́B");
            System.out.println("�N�����͂��Ă��������B");
            line = reader.readLine();
            int age = Integer.parseInt(line);
            System.out.println("���� " + age + " �΂Ƃ���ƁA10�N��� " + (age + 10) + " �΂ł��ˁB");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("�N�����������܂���B");
        }
    }
}
