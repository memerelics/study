import java.io.*;

public class DrinkSwitch {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("���ݕ��͉����D���ł����H");
            System.out.println("�����I�����W�W���[�X");
            System.out.println("�����R�[�q�[");
            System.out.println("�����ǂ���ł��Ȃ�");
            System.out.println("���A���A���A�̂ǂꂩ��I��ł��������B");
            String line = reader.readLine();
            char c = line.charAt(0);
            switch (c) {
            case '��':
                System.out.println("�I�����W�W���[�X�ł��B");
                break;

            case '��':
                System.out.println("�R�[�q�[�ł��B");
                break;

            default:
                System.out.println("�ǂ���ł�����܂���B");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
