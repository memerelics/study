import java.io.*;

public class ShowUnicode {
    public static void main(String[] args) {
        System.out.println("���������͂��Ă��������B");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                System.out.println("'" + c + "' �̕����R�[�h�� " + (int)c + "�ł��B");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
