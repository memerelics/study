import java.io.*;

public class Drink1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("���ݕ��͉����D���ł����H");
            System.out.println("1 �I�����W�W���[�X");
            System.out.println("2 �R�[�q�[");
            System.out.println("3 �ǂ���ł��Ȃ�");
            System.out.println("1,2,3�̂ǂꂩ��I��ł��������B");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            switch (n) {
            case 1;
                System.out.println("�I�����W�W���[�X�ł��B");

            case 1:
                System.out.println("�R�[�q�[�ł��B");
                break;

            difault:
                System.out.println("�ǂ���ł�����܂���B");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("�����̌`��������������܂���B");
        }
    }
}
