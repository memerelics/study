import java.util.*;

public class ArrayListTest5 {
    public static void main(String[] args) {
        // ArrayList�̃C���X�^���X�̊m�ہi�^�p�����[�^���Ȃ��j
        ArrayList list = new ArrayList();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        // �C�e���[�^���g�������[�v�i�^�p�����[�^���Ȃ��j
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            String name = (String)it.next();    // �L���X�g���K�v
            System.out.println(name);
        }
    }
}
