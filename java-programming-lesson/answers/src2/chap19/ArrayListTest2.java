import java.util.*;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // ArrayList�̃C���X�^���X�̊m��
        ArrayList<String> list = new ArrayList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        // ����ɁA�v�f�̒ǉ�(add���\�b�h)
        list.add("Diana");
        list.add("Elmo");

        // �v�f�̎Q��(get���\�b�h)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
