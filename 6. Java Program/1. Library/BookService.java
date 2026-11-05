public interface BookService {

    // 도서 등록
    void addBook(String title, String author, String category);

    // 전체 도서 조회
    void showAllBooks();

    // 도서 검색
    void searchBooks(String keyword);

    // 도서 삭제
    void deleteBook(int id);

    // 도서 대여
    void borrowBook(int id);

    // 도서 반납
    void returnBook(int id);

    // 도서 통계
    void showStatistics();
}