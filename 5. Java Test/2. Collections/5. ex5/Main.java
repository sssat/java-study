// 문제 5. 다음 리스트에서 중복을 제거하되, 최초 등장 순서를 유지하시오.
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>(Arrays.asList("Kim", "Lee", "Park", "Kim", "Choi", "Lee"));

        Set<String> arr2 = new LinkedHashSet<>(arr1);
        System.out.println(arr2);
    }
}
