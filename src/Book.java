import java.security.PrivateKey;

public class Book extends Editions implements Detailable{
    private String bookName;
    private int pageNumber;
    private int yearIssue;


    public Book(String bookName, int pageNumber, int yearIssue) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.yearIssue = yearIssue;
        this.numberOfPages = numberOfPage;
        super.avable=true;
    }

    public Book() {
        this.bookName = "Unknown";
        this.pageNumber = 10;
        this.yearIssue = 1990;
        super.avable=true;
        this.numberOfPages = 100;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    @Override
    public void getDetail() {
        System.out.println(getBookName()+"\n"+ getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book name: '" + bookName + '\'' +
                ", Author: '" + author + '\'' +
                ", Year issue: " + yearIssue +
                '}';
    }
}
