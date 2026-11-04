// 문제 6. 다음 학생 이름과 점수를 HashMap에 저장한 후, 80점 이상인 학생의 이름과 점수를 출력하시오.
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>(Map.of("Kim", 95, "Lee", 75, "Park", 85, "Choi", 60));
        
        for (String name : scores.keySet()) {
            int score = scores.get(name);
            
            if (score >= 80) {
                System.out.println(name + " : " + score);
            }
        }
    }
}