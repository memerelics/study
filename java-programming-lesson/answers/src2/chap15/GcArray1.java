public class GcArray1 {
    public static void main(String[] args) {
        while (true) {
            int[] a = new int[1000];    
            for (int i = 0; i < 1000; i++) {
                a[i] = i;
            }
            System.out.println("�c�胁���� = " + Runtime.getRuntime().freeMemory());
        }
    }
}
