import java.util.*;

public class LinkedListTest1 {
    public static void main(String[] args) {
        // LinkedList�̃C���X�^���X���m�ۂ���
        LinkedList<String> list = new LinkedList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        // ���݂̏��
        System.out.println(list);

        // �擪��Alice��}��
        list.addFirst("Alice");

        // Alice��}��������̏��
        System.out.println(list);
    }
}
