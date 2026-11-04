// 문제 3. 배열에서 최댓값 찾기

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 42, 23, 7};
        int max = numbers[0];

        for (int i = 1; i < numbers.length - 1; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
