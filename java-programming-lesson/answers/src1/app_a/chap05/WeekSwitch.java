import java.io.*;

public class WeekSwitch {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0�`6�̐�������͂��Ă��������B�Ή������j����\�����܂��B");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            switch (n) {
            case 0:
                System.out.println("���j��");
                break;
            case 1:
                System.out.println("���j��");
                break;
            case 2:
                System.out.println("�Ηj��");
                break;
            case 3:
                System.out.println("���j��");
                break;
            case 4:
                System.out.println("�ؗj��");
                break;
            case 5:
                System.out.println("���j��");
                break;
            case 6:
                System.out.println("�y�j��");
                break;
            default:
                System.out.println("0�`6�͈̔͂œ��͂��Ă�������");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("��������͂��Ă�������");
        }
    }
}
