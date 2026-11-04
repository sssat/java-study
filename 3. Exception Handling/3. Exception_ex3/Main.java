public class Main {
    public static void main(String[] args) {

        try {
            checkAge(15);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // throws: 예외가 발생하면 상위메서드로 예외를 던진다.
    // 예외를 발생시키는 키워드는 throw고 예외를 메서드에 선언하는 키워드는 throws 이다.
    public static void checkAge(int age) throws Exception {

        if (age < 20) {
            throw new Exception("미성년자는 가입할 수 없습니다.");
        }

        System.out.println("가입 성공");
    }
}