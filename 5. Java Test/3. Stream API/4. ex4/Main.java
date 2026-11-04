// 문제 4. 다음 리스트를 내림차순으로 정렬하시오.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 20, 40, 30);

        List<Integer> result = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result);
    }
}