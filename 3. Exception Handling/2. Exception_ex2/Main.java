public class Main {
    public static void main(String[] args) {
        try {
            register("abc");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // throw: 예외를 강제로 발생시킨 후 catch문으로 예외를 던진다.
    // 원래는 프로그램이 알아서 에러를 탐지하고 처리 하였지만, 이번에는 사용자가 일부러 에러를 throw 함.
    public static void register(String loginId) {
        if (loginId.length() < 4) {
            throw new IllegalArgumentException("아이디는 4자리 이상이어야 합니다.");
        }
    }
}
