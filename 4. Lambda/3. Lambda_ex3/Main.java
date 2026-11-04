import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("Spring Boot"));
    }
}