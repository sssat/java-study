import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 20;

        // test(): 입력값을 받아 특정 조건을 검사한 후, 그 결과에 따라 boolean(true 또는 false) 값을 반환하는 Predicate 인터페이스테 정의된 메서드
        System.out.println(isAdult.test(25));
        System.out.println(isAdult.test(15));
    }
}