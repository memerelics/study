import java.util.*;

public class HashSetTest1 {
    public static void main(String[] args) {
        // Set�Ƃ���HashSet�̃C���X�^���X���m�ۂ���
        Set<String> set = new HashSet<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        set.add("Alice");
        set.add("Bob");
        set.add("Chris");
        set.add("Diana");
        set.add("Elmo");

        // �g��for���[�v
        for (String name : set) {
            System.out.println(name);
        }

        // Alice�͊܂܂�Ă��邩�H
        if (set.contains("Alice")) {
            System.out.println("set��Alice�͊܂܂�Ă��܂��B");
        } else {
            System.out.println("set��Alice�͊܂܂�Ă��܂���B");
        }
    }
}
