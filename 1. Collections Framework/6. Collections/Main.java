import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(
            List.of(70, 90, 60, 100, 80)
        );
        System.out.println(scores);

        // 오름차순
        Collections.sort(scores);
        System.out.println(scores);

        // 내림차순
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println(scores);

        // 최대값
        System.out.println(Collections.max(scores));

        // 최소값
        System.out.println(Collections.min(scores));

        // 특정 값 등장 횟수
        System.out.println(Collections.frequency(scores, 90));
    }
}
