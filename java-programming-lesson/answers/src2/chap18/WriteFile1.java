import java.io.*;

public class WriteFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava WriteFile1 �쐬�t�@�C��");
            System.out.println("��Fjava WriteFile1 output.txt < input.txt");
            System.exit(0);
        }
        String filename = args[0];
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
