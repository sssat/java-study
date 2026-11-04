import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private final BookRepository repository;
    private int nextId = 1;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // 1. 도서 등록
    public void addBook(String title, String author, String category) {

        if (title == null || title.isBlank()) {
            throw new BookException("도서 제목을 입력해야 합니다.");
        }

        if (author == null || author.isBlank()) {
            throw new BookException("저자를 입력해야 합니다.");
        }

        if (category == null || category.isBlank()) {
            throw new BookException("카테고리를 입력해야 합니다.");
        }

        Book book = new Book(nextId++, title, author, category);

        repository.save(book);

        System.out.println("[성공] 도서가 등록되었습니다.");
    }

    // 2. 전체 도서 조회
    public void showAllBooks() {

        List<Book> books = repository.findAll();

        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        books.forEach(System.out::println);
    }

    // 3. 도서 검색 (Stream)
    public void searchBooks(String keyword) {

        if (keyword == null || keyword.isBlank()) {
            throw new BookException("검색어를 입력해야 합니다.");
        }

        String lowerKeyword = keyword.toLowerCase();

        List<Book> result = repository.findAll().stream()
                .filter(book ->
                        book.getTitle().toLowerCase().contains(lowerKeyword))
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();

        if (result.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        result.forEach(System.out::println);
    }

    // 4. 도서 삭제
    public void deleteBook(int id) {

        Book book = findBookOrThrow(id);

        if (book.isBorrowed()) {
            throw new BookException("대여 중인 도서는 삭제할 수 없습니다.");
        }

        repository.delete(id);

        System.out.println("[성공] 도서가 삭제되었습니다.");
    }

    // 5. 도서 대여
    public void borrowBook(int id) {

        Book book = findBookOrThrow(id);

        if (book.isBorrowed()) {
            throw new BookException("이미 대여 중인 도서입니다.");
        }

        book.setBorrowed(true);

        System.out.println("[성공] 도서 대여가 완료되었습니다.");
    }

    // 6. 도서 반납
    public void returnBook(int id) {

        Book book = findBookOrThrow(id);

        if (!book.isBorrowed()) {
            throw new BookException("대여 중이지 않은 도서입니다.");
        }

        book.setBorrowed(false);

        System.out.println("[성공] 도서 반납이 완료되었습니다.");
    }

    // 7. 도서 통계 (Stream)
    public void showStatistics() {

        List<Book> books = repository.findAll();

        long total = books.stream().count();

        long borrowed = books.stream()
                .filter(Book::isBorrowed)
                .count();

        long available = total - borrowed;

        System.out.println("전체 도서: " + total);
        System.out.println("대여 중: " + borrowed);
        System.out.println("대여 가능: " + available);

        // 카테고리별 도서 개수
        Map<String, Long> categoryCounts = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.counting()
                ));

        System.out.println("[카테고리별 도서 수]");

        categoryCounts.forEach((category, count) ->
                System.out.println(category + ": " + count));
    }

    // 공통 메서드: 도서 조회 및 예외 처리
    private Book findBookOrThrow(int id) {

        Book book = repository.findById(id);

        if (book == null) {
            throw new BookException("존재하지 않는 도서입니다.");
        }

        return book;
    }
}