public class Kamoku {
    String namae;   // �Ȗږ�
    int tensuu;     // �_��

    // �R���X�g���N�^
    public Kamoku(String namae, int tensuu) {
        this.namae = namae;
        this.tensuu = tensuu;
    }

    // �Ȗڂ̕�����\��
    public String toString() {
        return namae + "��" + tensuu + "�_";
    }
}
