// 문제 2. 다음 리스트에서 최댓값과 최솟값을 구하시오.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(15, 7, 32, 9, 21));

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}