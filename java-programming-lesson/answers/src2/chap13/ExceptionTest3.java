public class ExceptionTest3 {
    public static void main(String[] args) {
        int[] myarray = new int[3]; 
        try {
            System.out.println("������܂�");
            myAssign(myarray, 100, 0);
            System.out.println("������܂���");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����ł��܂���ł���");
            System.out.println("��O��" + e + "�ł�");
        }
        System.out.println("�I�����܂�");
    }
    static void myAssign(int[] arr, int index, int value) {
        System.out.println("myAssign�ɗ��܂���");
        arr[index] = value;
        System.out.println("myAssign����A��܂�");
    }
}
