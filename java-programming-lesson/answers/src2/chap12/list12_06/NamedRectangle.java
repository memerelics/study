class NamedRectangle extends Rectangle {
    String name;
    NamedRectangle() {
        super();         // �X�[�p�[�N���X�̈����Ȃ��R���X�g���N�^�̌Ăяo��
                         //�i�ȗ����Ă������j
        name = "NO NAME";
    }
    NamedRectangle(String name) {
        super(200, 32);  // �X�[�p�[�N���X�̈����t���R���X�g���N�^�̌Ăяo��
                         //�i�ȗ������super();�ɂȂ�j
        this.name = name;
    }
}
