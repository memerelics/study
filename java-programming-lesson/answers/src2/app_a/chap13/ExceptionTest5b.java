public class ExceptionTest5b {
    public static void main(String[] args) {
        try {
            method1(0);
        } catch (Exception e) {
            System.out.println("method1:��O:" + e);
        }
        try {
            method2(0);
        } catch (Exception e) {
            System.out.println("method2:��O:" + e);
        }
        try {
            method3(0);
        } catch (Exception e) {
            System.out.println("method3:��O:" + e);
        }
    }
    static void method1(int x) throws Exception {
        if (x > 0) {
            throw new Exception();
        }
    }
    static void method2(int x) throws Exception {
        if (x == 0) {
            throw new Exception();
        }
    }
    static void method3(int x) throws Exception {
        if (x > 0) {
            throw new Exception();
        }
    }
}
