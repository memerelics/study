import java.io.*;

public class ListDir1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava ListDir1 �f�B���N�g����");
            System.out.println("��Fjava ListDir1 doc");
            System.exit(0);
        }
        String dirname = args[0];
        File dir = new File(args[0]);
        String[] dirlist = dir.list(); 
        for (int i = 0; i < dirlist.length; i++) {
            System.out.println(dirlist[i]);
        }
    }
}
