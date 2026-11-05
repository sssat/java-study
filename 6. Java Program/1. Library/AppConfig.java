public class AppConfig {

    // Repository 구현체 생성
    public BookRepository bookRepository() {
        return new MemoryBookRepository();
        // return new MySQLBookRepository();
    }

    // Service 구현체 생성 및 의존성 주입
    public BookService bookService() {
        return new BookServiceImpl(bookRepository());
    }
}