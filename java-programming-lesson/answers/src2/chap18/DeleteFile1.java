import java.io.*;

public class DeleteFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava DeleteFile1 �폜�t�@�C��");
            System.out.println("��Fjava DeleteFile1 trash.txt");
            System.exit(0);
        }
        String filename = args[0];
        File file = new File(filename);
        if (file.delete()) {
            System.out.println(filename + "���폜���܂����B");
        } else {
            System.out.println(filename + "�͍폜�ł��܂���ł����B");
        }
    }
}
