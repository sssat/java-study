import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> members = new HashMap<>();

        members.put(1, "Kim");
        members.put(2, "Lee");
        members.put(3, "Park");
        System.out.println(members);
        System.out.println(members.get(2));
        System.out.println(members.containsKey(2));
        System.out.println(members.containsValue("Park"));
        System.out.println();

        members.replace(1, "Choi");
        members.remove(3);
        System.out.println(members);
    }
}
