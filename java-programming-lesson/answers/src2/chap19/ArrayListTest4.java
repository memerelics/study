import java.util.*;

public class ArrayListTest4 {
    public static void main(String[] args) {
        // ArrayList�̃C���X�^���X�̊m��
        ArrayList<String> list = new ArrayList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        // �g��for���[�v
        for (String name : list) {
            System.out.println(name);
        }
    }
}
