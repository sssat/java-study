// 문제 2. 다음 리스트의 모든 문자열을 대문자로 변환하시오.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kim", "lee", "park");

        List<String> result = names.stream().map(String::toUpperCase).toList();
        System.out.println(result);
    }
}
