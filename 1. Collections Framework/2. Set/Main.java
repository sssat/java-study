import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> members = new HashSet<>();

        members.add("Kim");
        members.add("Lee");
        members.add("Kim");
        members.add("Park");
        System.out.println(members);
        System.out.println(members.contains("Kim"));
        System.out.println(members.contains("ASDF"));

        members.remove("Park");
        System.out.println(members);
    }
}
