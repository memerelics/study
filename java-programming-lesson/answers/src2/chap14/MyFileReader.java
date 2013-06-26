import java.io.*;

class MyFileReader extends FileReader implements DebugPrintable { 
    String filename = null;
    public MyFileReader(String filename) throws FileNotFoundException {
        super(filename);
        this.filename = filename;
    }
    public void debugPrint() {
        System.out.println("MyFileReader�̃C���X�^���X�F�t�@�C������" + filename + "�ł��B");
    }
}
