public class GcArray3 {
    public static void main(String[] args) {
        for (int n = 0; true; n++) {
            int[] a = new int[1000];  
            for (int i = 0; i < 1000; i++) {
                a[i] = i;
            }
            if (n % 100 == 0) {
                System.out.println("gc���Ăяo���܂��B");
                System.gc();
            }
            System.out.println("�c�胁���� = " + Runtime.getRuntime().freeMemory());
        }
    }
}
