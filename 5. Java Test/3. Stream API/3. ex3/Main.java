// 문제 3. 다음 리스트에서 중복을 제거한 후 오름차순으로 정렬하시오.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 3, 2, 5, 4);

        List<Integer> result = numbers.stream().distinct().sorted().toList();
        System.out.println(result);
    }
}
