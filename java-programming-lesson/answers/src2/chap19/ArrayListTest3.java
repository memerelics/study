import java.util.*;

public class ArrayListTest3 {
    public static void main(String[] args) {
        // ArrayList�̃C���X�^���X�̊m��
        ArrayList<String> list = new ArrayList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        // �C�e���[�^���g����for���[�v
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
