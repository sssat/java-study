// 문제 7. 다음 Map에서 가장 높은 점수를 가진 학생의 이름을 출력하시오.
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>(Map.of("Kim", 96, "Lee", 92, "Park", 99, "Choi", 78));
        int max = 0;
        String max_name = "";

        for (String name : scores.keySet()) {
            int score = scores.get(name);

            if (max < score) {
                max = score;
                max_name = name;
            }
        }
        
        System.out.println(max_name);
    }
}