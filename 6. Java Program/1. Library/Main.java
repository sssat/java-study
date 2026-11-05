import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        // AppConfig를 통해 객체 생성 및 의존성 주입
        AppConfig appConfig = new AppConfig();
        BookService service = appConfig.bookService();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("========== 도서 관리 시스템 ==========");
            System.out.println("1. 도서 등록");
            System.out.println("2. 전체 도서 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 대여");
            System.out.println("6. 도서 반납");
            System.out.println("7. 도서 통계");
            System.out.println("0. 종료");
            System.out.println("====================================");
            System.out.print("메뉴 선택: ");

            try {
                int menu = scanner.nextInt();
                scanner.nextLine(); // nextInt()가 남긴 Enter 제거

                switch (menu) {

                    case 1:
                        System.out.print("도서 제목: ");
                        String title = scanner.nextLine();

                        System.out.print("저자: ");
                        String author = scanner.nextLine();

                        System.out.print("카테고리: ");
                        String category = scanner.nextLine();

                        service.addBook(title, author, category);
                        break;

                    case 2:
                        service.showAllBooks();
                        break;

                    case 3:
                        System.out.print("검색할 제목: ");
                        String keyword = scanner.nextLine();

                        service.searchBooks(keyword);
                        break;

                    case 4:
                        System.out.print("삭제할 도서 ID: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());

                        service.deleteBook(deleteId);
                        break;

                    case 5:
                        System.out.print("대여할 도서 ID: ");
                        int borrowId = Integer.parseInt(scanner.nextLine());

                        service.borrowBook(borrowId);
                        break;

                    case 6:
                        System.out.print("반납할 도서 ID: ");
                        int returnId = Integer.parseInt(scanner.nextLine());

                        service.returnBook(returnId);
                        break;

                    case 7:
                        service.showStatistics();
                        break;

                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("올바른 메뉴를 선택해주세요.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("[오류] 숫자를 입력해주세요.");
                scanner.nextLine(); // 잘못 입력한 문자열 제거

            } catch (NumberFormatException e) {
                System.out.println("[오류] 숫자를 입력해주세요.");

            } catch (BookException e) {
                System.out.println("[오류] " + e.getMessage());
            }
        }
    }
}