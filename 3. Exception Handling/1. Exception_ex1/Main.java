public class Main {
    public static void main(String[] args) {
        try {
            String[] names = {"Kim", "Lee", "Park"};

            // 오류1: 존재하지 않는 인덱스 접근
            System.out.println(names[5]);

            // 오류2: null 객체의 메서드 호출
            String name = null;
            System.out.println(name.length());
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 오류");

        } catch (NullPointerException e) {
            System.out.println("Null 참조 오류");

        } catch (Exception e) {
            System.out.println("위에서 처리하지 않은 기타 예외 발생");

        } finally {
            System.out.println("변환 작업 종료");
        }
    }
}
