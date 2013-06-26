import java.util.*;

public class LinkedListTest2 {
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

        // �擪�v�f�̎Q��(peek���\�b�h)
        while (queue.peek() != null) {
            // �v�f�̒��o�ƍ폜(poll���\�b�h)
            String name = queue.poll();
            System.out.println("poll�̖߂�l   = " + name);
            System.out.println("poll���queue  = " + queue);
        }
    }
}
