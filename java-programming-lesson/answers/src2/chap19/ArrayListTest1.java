import java.util.*;

public class ArrayListTest1 {
    public static void main(String[] args) {
        // ArrayList�̃C���X�^���X�̊m��
        ArrayList<String> list = new ArrayList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        // �v�f�̎Q��(get���\�b�h)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
