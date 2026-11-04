import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        
        // filter(): 조건에 맞는 요소만 선택
        // map(): 각 요소를 다른 값으로 변환
        // toList(): Stream 처리 결과를 List로 변환
        List<Integer> result = numbers.stream().filter(num -> num >= 30).map(num -> num * 2).toList();
        System.out.println(result);
    }
}
