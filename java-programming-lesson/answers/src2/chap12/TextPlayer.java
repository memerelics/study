public class TextPlayer extends Player {
    String text;
    public TextPlayer(String text) {
        this.text = text;
    }
    public void play() {
        System.out.println(text);
    }
    public static void main(String[] args) {
        TextPlayer player = new TextPlayer("����ɂ���");
        player.loop(3);
    }
}
