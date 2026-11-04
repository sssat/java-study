// 문제 1. 다음 리스트에서 짝수만 추출하여 새로운 리스트로 저장하시오.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> result = numbers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(result);
    }
}
