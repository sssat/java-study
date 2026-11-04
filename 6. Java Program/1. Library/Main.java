import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookRepository repository = new BookRepository();
        BookService service = new BookService(repository);

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

            String input = scanner.nextLine();

            try {
                int menu = Integer.parseInt(input);

                switch (menu) {

                    case 1 -> {
                        System.out.print("도서 제목: ");
                        String title = scanner.nextLine();

                        System.out.print("저자: ");
                        String author = scanner.nextLine();

                        System.out.print("카테고리: ");
                        String category = scanner.nextLine();

                        service.addBook(title, author, category);
                    }

                    case 2 -> {
                        service.showAllBooks();
                    }

                    case 3 -> {
                        System.out.print("검색할 제목: ");
                        String keyword = scanner.nextLine();

                        service.searchBooks(keyword);
                    }

                    case 4 -> {
                        System.out.print("삭제할 도서 ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        service.deleteBook(id);
                    }

                    case 5 -> {
                        System.out.print("대여할 도서 ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        service.borrowBook(id);
                    }

                    case 6 -> {
                        System.out.print("반납할 도서 ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        service.returnBook(id);
                    }

                    case 7 -> {
                        service.showStatistics();
                    }

                    case 0 -> {
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;
                    }

                    default -> {
                        System.out.println("올바른 메뉴를 선택해주세요.");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("[오류] 숫자를 입력해주세요.");

            } catch (BookException e) {
                System.out.println("[오류] " + e.getMessage());
            }
        }
    }
}