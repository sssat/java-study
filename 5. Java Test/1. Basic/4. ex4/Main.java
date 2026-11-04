// 문제 4. 문자열을 앞에서 읽거나 뒤에서 읽어도 동일한지 확인하시오.

public class Main {
    public static void main(String[] args) {
        String str = "level";
        boolean isPalimdrom = true;

        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalimdrom = false;
                break;
            }
        }

        if (isPalimdrom == true) {
            System.out.println("동일합니다.");
        }
        else {
            System.out.println("동일하지 않습니다.");
        }
    }
}
