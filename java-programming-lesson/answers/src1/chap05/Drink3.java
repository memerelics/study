import java.io.*;

public class Drink3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("���ݕ��͉����D���ł����H");
            System.out.println("1 �I�����W�W���[�X(a)");
            System.out.println("2 �R�[�q�[(b)");
            System.out.println("3 �ǂ���ł��Ȃ�(c)");
            System.out.println("1,2,3�̂ǂꂩ��I��ł��������ia,b,c�ł��I�ׂ܂��j�B");
            String line = reader.readLine();
            char c = line.charAt(0);
            switch (c) {
            case '1':
            case 'a':
                System.out.println("�I�����W�W���[�X�ł��B");
                break;

            case '2':
            case 'b':
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
