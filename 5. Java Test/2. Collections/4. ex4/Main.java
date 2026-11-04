// 문제 4. 다음 리스트의 중복된 값을 제거하시오.
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5));

        Set<Integer> arr2 = new HashSet<>(arr1);
        System.out.println(arr2);
    }
}
