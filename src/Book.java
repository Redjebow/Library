import java.security.PrivateKey;

public class Book extends Editions implements Detailable{
    private String bookName;
    private int pageNumber;
    private String bookAuthor;
    private int yearIssue;


    public Book(String bookName, String bookAuthor int pageNumber, int yearIssue) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageNumber = pageNumber;
        this.yearIssue = yearIssue;
        super.avable=true;
    }

    public Book() {
        this.bookName = "Unknown";
        this.bookAuthor = "Unknown";
        this.pageNumber = 10;
        this.yearIssue = 1990;
        super.avable=true;
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
