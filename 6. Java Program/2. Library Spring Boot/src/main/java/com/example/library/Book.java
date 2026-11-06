package com.example.library;

public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private boolean borrowed;

    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.borrowed = false;
    }

    // 도서 ID 반환
    public int getId() {
        return id;
    }

    // 도서 제목 반환
    public String getTitle() {
        return title;
    }

    // 도서 저자 반환
    public String getAuthor() {
        return author;
    }

    // 도서 카테고리 반환
    public String getCategory() {
        return category;
    }

    // 도서 대여 상태 반환 (true: 대여중, false: 대여 가능)
    public boolean isBorrowed() {
        return borrowed;
    }

    // 도서 대여 상태 변경
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // 도서 객체의 정보를 문자열로 변환하여 반환
    @Override
    public String toString() {
        return "ID: " + id + " | 제목: " + title + " | 저자: " + author + " | 카테고리: " + category + " | 상태: " + (borrowed ? "대여 중" : "대여 가능");
    }
}
