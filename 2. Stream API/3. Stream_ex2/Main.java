import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(30, 10, 50, 30, 20, 40, 50);

        // distinct(): 중복된 요소 제거
        // sorted(): 오름차순 정렬
        // limit(3): 앞에서부터 3개만 선택
        List<Integer> result = numbers.stream().distinct().sorted().limit(3).toList();
        System.out.println(result);
    }
}
