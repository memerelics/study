import java.util.*;

public class ArrayListTest7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // Alice, Bob, Chris, Diana, Elmo��ǉ�
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        // �폜�O�ɗv�f��\��
        System.out.println("�폜�̑O");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        // Alice��Bob��Elmo���폜
        list.remove("Alice");
        list.remove("Bob");
        list.remove("Elmo");

        // �폜��ɗv�f��\��
        System.out.println("�폜�̌�");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        // Alice�͊܂܂�Ă��邩�H
        if (list.contains("Alice")) {
            System.out.println("list��Alice�͊܂܂�Ă��܂��B");
        } else {
            System.out.println("list��Alice�͊܂܂�Ă��܂���B");
        }
    }
}
