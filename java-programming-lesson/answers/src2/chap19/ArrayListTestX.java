import java.util.*;

public class ArrayListTestX {
    public static void main(String[] args) {
        // List�Ƃ���ArrayList�̃C���X�^���X���m�ۂ���
        List<String> list = new ArrayList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Bob");
        list.add("Elmo");

        // �ŏ��ƍŌ�̗v�f�̎Q��(get���\�b�h��size���\�b�h)
        System.out.println("�ŏ��̗v�f = " + list.get(0));
        System.out.println("�Ō�̗v�f = " + list.get(list.size() - 1));

        // ���ׂĂ̗v�f�̎Q��
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Bob�̓Y���́H
        System.out.println("�ŏ��ɏo�Ă���Bob�̓Y�� = " + list.indexOf("Bob"));
        System.out.println("�Ō�ɏo�Ă���Bob�̓Y�� = " + list.lastIndexOf("Bob"));
    }
}
