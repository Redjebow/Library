import java.util.ArrayList;
import java.util.List;

public class Library {
    private String nameLibrary;
    private String adressLibrary;
    private String workingTime;
    private List<Editions> editionList;
    private AddEdition addEdition;
    private Print printEditions;
    private Search searchEditions;
    public Library(String nameLibrary, String adressLibrary, String workingTime) {
        this.nameLibrary = nameLibrary;
        this.adressLibrary = adressLibrary;
        this.workingTime = workingTime;
        this.editionList=new ArrayList<>();
        this.addEdition =new AddEdition(editionList);
        this.printEditions = new Print(editionList);
        this.searchEditions = new Search(editionList);
    }
    public Library() {
        this.nameLibrary = "Hristo Botev";
        this.adressLibrary = "Razgrad, bul. Aprilsko Vastanie";
        this.workingTime = "09:00 - 18:00";
        this.editionList=new ArrayList<>();
        this.addEdition =new AddEdition(editionList);
        this.printEditions = new Print(editionList);
        this.searchEditions = new Search(editionList);
    }


    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public String getAdressLibrary() {
        return adressLibrary;
    }

    public void setAdressLibrary(String adressLibrary) {
        this.adressLibrary = adressLibrary;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public void addEditionsList(Editions edition){
        addEdition.addEditionList(edition);

    }
    public void printList(){
        printEditions.printList(editionList);
    }
    public void searchEditions(Editions editions){
        searchEditions.search(editions);

    }




}
