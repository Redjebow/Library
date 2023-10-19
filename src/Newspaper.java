public class Newspaper extends Editions implements Detailable{
    private String newspaperName;
    private String dateToCreate;

    public Newspaper(String newspaperName, String dateToCreate) {
        this.newspaperName = newspaperName;
        this.dateToCreate = dateToCreate;
    }

    public Newspaper() {
        this.newspaperName = "Unknown";
        this.dateToCreate = "Unknown";
    }

    public String getNewspaperName() {
        return newspaperName;
    }

    public void setNewspaperName(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public String getDateToCreate() {
        return dateToCreate;
    }

    public void setDateToCreate(String dateToCreate) {
        this.dateToCreate = dateToCreate;
    }

    @Override
    public void getDetail() {
        System.out.println(getNewspaperName()+"\n"+getDateToCreate());
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "Newspaper name='" + newspaperName + '\'' +
                ", Date to create='" + dateToCreate + '\'' +
                '}';
    }
}
