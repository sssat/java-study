// 문제 1. ArrayList에 다음 문자열을 순서대로 추가한 뒤, "Banana"를 삭제하고 전체 요소를 출력하시오.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grape"));

        arr.remove("Banana");
        System.out.println(arr);
    }
}
