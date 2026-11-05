import java.util.List;

public interface BookRepository {
    // 도서 저장
    void save(Book book);

    // 전체 도서 조회
    List<Book> findAll();

    // ID로 도서 조회
    Book findById(int id);

    // 도서 삭제
    void delete(int id);
}