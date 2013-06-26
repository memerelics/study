import java.io.*;

public class RenameFile2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("�g�p�@�Fjava RenameFile2 ���݂̃t�@�C���� �V�����t�@�C����");
            System.out.println("��Fjava RenameFile2 old.txt new.txt");
            System.exit(0);
        }
        String oldfilename = args[0];
        String newfilename = args[1];
        File oldfile = new File(oldfilename);
        File newfile = new File(newfilename);
        if (!oldfile.exists()) {
            System.out.println(oldfilename + "��������܂���B");
        } else if (newfile.exists()) {
            System.out.println(newfilename + "�͂��łɑ��݂��܂��B");
        } else if (oldfile.renameTo(newfile)) {
            System.out.println(oldfilename + "��" + newfilename + "�ɕύX���܂����B");
        } else {
            System.out.println(oldfilename + "��" + newfilename + "�ɕύX�ł��܂���ł����B");
        }
    }
}
