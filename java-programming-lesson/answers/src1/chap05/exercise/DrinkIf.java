import java.io.*;

public class DrinkIf {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("���ݕ��͉����D���ł����H");
            System.out.println("�����I�����W�W���[�X");
            System.out.println("�����R�[�q�[");
            System.out.println("�����ǂ���ł��Ȃ�");
            System.out.println("���A���A���A�̂ǂꂩ��I��ł��������B");
            String line = reader.readLine();
            if (line.equals("��")) {
                System.out.println("�I�����W�W���[�X�ł��B");
            } else if (line.equals("��")) {
                System.out.println("�R�[�q�[�ł��B");
            } else {
                System.out.println("�ǂ���ł�����܂���B");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
