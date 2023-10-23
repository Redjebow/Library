import java.util.ArrayList;
import java.util.List;

public class AddEdition{
    private final List<Editions>editionsList;

    public AddEdition(List<Editions> editionsList) {
        this.editionsList = editionsList;
    }

    public void addEditionList(Editions edition){
        editionsList.add(edition);
    }
}
