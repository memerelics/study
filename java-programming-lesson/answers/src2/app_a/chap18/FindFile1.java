import java.io.*;

public class FindFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("�g�p�@�Fjava FindFile1 ���������� �����Ώۃt�@�C��");
            System.out.println("��Fjava FindFile1 System FindFile1.java");
            System.exit(0);
        }
        String findstring = args[0];
        String filename = args[1];
        try {
            String line;
            int linenum = 1;
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null) {
                int n = line.indexOf(findstring);
                if (n >= 0) {
                    System.out.println(linenum + ":" + line);
                }
                linenum++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(filename + "��������܂���B");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
