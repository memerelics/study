public class ArrayTest {
    public static void main(String[] args) {
        // �z��̊m��
        String[] array = new String[3];

        // �v�f�̑��
        array[0] = "Alice";
        array[1] = "Bob";
        array[2] = "Chris";

        // �v�f�̎Q��
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
