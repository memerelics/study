import java.util.*;

public class LinkedListTest4 {
    public static void main(String[] args) {
        // LinkedList�̃C���X�^���X���m�ۂ���
        LinkedList<String> stack = new LinkedList<String>();

        // �v�f�̒ǉ�(addFirst���\�b�h)
        stack.addFirst("Alice");
        System.out.println("addFirst���stack = " + stack);
        stack.addFirst("Bob");
        System.out.println("addFirst���stack = " + stack);
        stack.addFirst("Chris");
        System.out.println("addFirst���stack = " + stack);
        stack.addFirst("Diana");
        System.out.println("addFirst���stack = " + stack);
        stack.addFirst("Elmo");
        System.out.println("addFirst���stack = " + stack);

        try {
            while (true) {
                // �擪�v�f�̎Q��(getFirst���\�b�h)
                String name = stack.getFirst();
                System.out.println("getFirst�̖߂�l = " + name);

                // �v�f�̒��o�ƍ폜(removeFirst���\�b�h)
                name = stack.removeFirst();
                System.out.println("removeFirst�̖߂�l = " + name);
                System.out.println("removeFirst���stack = " + stack);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
