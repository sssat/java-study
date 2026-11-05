import java.util.*;

public class MemoryBookRepository implements BookRepository {

    private final List<Book> books = new ArrayList<>();
    private final Map<Integer, Book> bookMap = new HashMap<>();

    // 도서 저장
    @Override
    public void save(Book book) {
        books.add(book);
        bookMap.put(book.getId(), book);
    }

    // 전체 도서 조회
    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    // ID로 도서 조회
    @Override
    public Book findById(int id) {
        return bookMap.get(id);
    }

    // 도서 삭제
    @Override
    public void delete(int id) {
        books.removeIf(book -> book.getId() == id);
        bookMap.remove(id);
    }
}