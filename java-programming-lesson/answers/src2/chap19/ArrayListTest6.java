import java.util.*;

public class ArrayListTest6 {
    public static void main(String[] args) {
        // ArrayList�̃C���X�^���X�̊m��
        ArrayList<Integer> list = new ArrayList<Integer>();

        // �v�f�̒ǉ�(add���\�b�h)
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        // �g��for���[�v
        for (int n : list) {
            System.out.println(n);
        }
    }
}
