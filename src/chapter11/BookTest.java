package chapter11;


class Book{
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}


public class BookTest {
    static void main() {
        Book book1 = new Book(200, "개미");

        System.out.println(book1); //toString() 실행됨.
        System.out.println(book1);
    }
}
