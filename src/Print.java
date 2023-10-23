import java.util.List;

public class Print{
    protected List<Editions>editionsList;

    public Print(List<Editions>editionsList) {
        this.editionsList = editionsList;
    }

    public void printList(List<Editions> editionsList){
        for(Editions edition: editionsList){
            System.out.println(edition.toString());
        }
    }
}
