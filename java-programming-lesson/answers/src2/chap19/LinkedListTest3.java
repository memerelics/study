import java.util.*;

public class LinkedListTest3 {
    public static void main(String[] args) {
        // Queue�Ƃ���LinkedList�̃C���X�^���X���m�ۂ���
        Queue<String> queue = new LinkedList<String>();

        // �v�f�̒ǉ�(offer���\�b�h)
        queue.offer("Alice");
        System.out.println("offer���queue = " + queue);
        queue.offer("Bob");
        System.out.println("offer���queue = " + queue);
        queue.offer("Chris");
        System.out.println("offer���queue = " + queue);
        queue.offer("Diana");
        System.out.println("offer���queue = " + queue);

        try {
            while (true) {
                // �擪�v�f�̎Q��(element���\�b�h)
                String name = queue.element();
                System.out.println("element�̖߂�l = " + name);

                // �v�f�̒��o�ƍ폜(remove���\�b�h)
                name = queue.remove();
                System.out.println("remove�̖߂�l = " + name);
                System.out.println("remove���queue = " + queue);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
