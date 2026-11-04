import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        List<Integer> result1 = new ArrayList<>();

        // 1. 기존 for문
        for (int num : numbers) {
            if (num >= 30) {
                result1.add(num);
            }
        }
        System.out.println(result1);

        // 2. Stream API
        List<Integer> result2 = numbers.stream().filter(num -> num >= 30).toList();
        System.out.println(result2);
    }
}
