import java.util.*;

public class Main {
    public static void main(String[] args) {

        // List
        List<String> members = new ArrayList<>();
        members.add("Kim");
        members.add("Lee");
        members.add("Kim");
        members.add("Park");
        System.out.println(members);
        System.out.println(members.get(0));

        members.set(1, "Choi");
        members.remove("Park");
        System.out.println(members);
        System.out.println(members.size());
    }
}