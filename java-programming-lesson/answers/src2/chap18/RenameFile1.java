import java.io.*;

public class RenameFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("�g�p�@�Fjava RenameFile1 ���݂̃t�@�C���� �V�����t�@�C����");
            System.out.println("��Fjava RenameFile1 old.txt new.txt");
            System.exit(0);
        }
        String oldfilename = args[0];
        String newfilename = args[1];
        File oldfile = new File(oldfilename);
        File newfile = new File(newfilename);
        if (oldfile.renameTo(newfile)) {
            System.out.println(oldfilename + "��" + newfilename + "�ɕύX���܂����B");
        } else {
            System.out.println(oldfilename + "��" + newfilename + "�ɕύX�ł��܂���ł����B");
        }
    }
}
