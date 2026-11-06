package com.example.library;

import java.util.List;

public class MySQLBookRepository implements BookRepository {

    // 도서 저장
    @Override
    public void save(Book book) {
        throw new UnsupportedOperationException("MySQL 도서 저장 기능은 아직 구현되지 않았습니다.");
    }

    // 전체 도서 조회
    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("MySQL 전체 조회 기능은 아직 구현되지 않았습니다.");
    }

    // ID로 도서 조회
    @Override
    public Book findById(int id) {
        throw new UnsupportedOperationException("MySQL 도서 조회 기능은 아직 구현되지 않았습니다.");
    }

    // 도서 삭제
    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("MySQL 도서 삭제 기능은 아직 구현되지 않았습니다.");
    }
}