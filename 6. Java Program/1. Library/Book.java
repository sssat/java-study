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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | 제목: " + title
                + " | 저자: " + author
                + " | 카테고리: " + category
                + " | 상태: " + (borrowed ? "대여 중" : "대여 가능");
    }
}