import java.io.*;

public class DisplayFile {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("�t�@�C���� " + args[i] + "====");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(args[i]));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("�t�@�C����������܂���F" + e);
            } catch (IOException e) {
                System.out.println("I/O�G���[�ł��F" + e);
            }
        }
    }
}
