import java.security.PrivateKey;

public class Book extends Editions implements Detailable{
    private String bookName;
    private String bookAuthor;
    private int yearIssue;
    private int numberOfPages;

    public Book(String bookName, String author, int yearIssue, int numberOfPage) {
        this.bookName = bookName;
        this.bookAuthor = author;
        this.yearIssue = yearIssue;
        this.numberOfPages = numberOfPage;
        super.avable=true;
    }

    public Book() {
        this.bookName = "Unknown";
        this.bookAuthor = "Unknown";
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
        return bookAuthor;
    }

    public void setAuthor(String author) {
        this.bookAuthor = author;
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
                ", Author: '" + bookAuthor + '\'' +
                ", Year issue: " + yearIssue +
                ", Number Of Page: "+yearIssue+
                '}';
    }
}
