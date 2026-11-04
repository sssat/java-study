// 문제 8. 각 학생의 평균 점수를 계산하여 새로운 Map<String, Double>에 저장하시오.

import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> info = new HashMap<>(Map.of("Kim", Arrays.asList(80, 90, 100), "Lee", Arrays.asList(70, 80, 90), "Park", Arrays.asList(90, 95, 100)));
        Map<String, Double> averageScores = new HashMap<>();

        for (String name : info.keySet()) {
            List<Integer> scores = info.get(name);

            int sum = 0;
            for (int i : scores) {
                sum += i;
            }

            double average = sum / scores.size();
            averageScores.put(name, average);
        }

        System.out.println(averageScores);
    }
}