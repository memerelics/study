class NamedRectangle extends Rectangle {
    String name;
    NamedRectangle() {
        this("NO NAME");    // �����̃N���X�̃R���X�g���N�^�̌Ăяo��
    }
    NamedRectangle(String name) {
        super(200, 32);
        this.name = name;
    }
}
