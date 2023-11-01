public class Book extends Editions implements Detailable{
    private String bookName;
    private String author;
    private int yearIssue;

    public Book(String bookName, String author, int yearIssue) {
        this.bookName = bookName;
        this.author = author;
        this.yearIssue = yearIssue;
        super.avable=true;
    }

    public Book() {
        this.bookName = "Unknown";
        this.author = "Unknown";
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
                ", Number Of Pages: "+yearIssue+
                '}';
    }
}
