 public class ExceptionTest2 {
     public static void main(String[] args) {
         int[] myarray = new int[3]; 
         try {
             System.out.println("������܂�");
             myarray[100] = 0;
             System.out.println("������܂���");
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("����ł��܂���ł���");
             System.out.println("��O��" + e + "�ł�");
         }
         System.out.println("�I�����܂�");
     }
 }
