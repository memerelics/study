import java.util.*;

public class HashMapTest1 {
    public static void main(String[] args) {
        // Map�Ƃ���HashMap�̃C���X�^���X���m�ۂ���
        Map<String,Integer> map = new HashMap<String,Integer>();

        // �L�[�ƒl�̃y�A��ǉ�(put���\�b�h)
        map.put("Alice", 100);
        map.put("Bob", 57);
        map.put("Chris", 85);
        map.put("Diana", 85);
        map.put("Elmo", 92);

        // �G���g���Ɋւ���g��for���[�v
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();

        // �L�[�Ɋւ���g��for���[�v
        for (String name : map.keySet()) {
            System.out.println(name);
        }
        System.out.println();

        // �l�Ɋւ���g��for���[�v
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        // �L�[�Ɋւ���g��for���[�v�Œl������
        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
        System.out.println();

        // �L�[Bob�̒l�𓾂�
        System.out.println("Bob�̒l = " + map.get("Bob"));

        // �L�[Fred�̒l�𓾂�
        System.out.println("Fred�̒l = " + map.get("Fred"));
    }
}
