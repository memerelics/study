import java.util.*;

public class Question {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        // ��1

        System.out.println(list.get(2)); // ��2

        System.out.println(list.size()); // ��3

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String name = it.next(); // ��4
            System.out.println(name);
        }

    }
}
