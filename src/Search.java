import java.util.List;

public class Search {
    protected List<Editions>editionsList;

    public Search(List<Editions> editionsList) {
        this.editionsList = editionsList;
    }

    public void search(Editions editionsByUser){
        for(Editions editions1:editionsList) {
            if (editionsByUser.equals(editions1)&& editionsByUser.avable) {
                editionsByUser.setAvable(false);
                System.out.println("Editions " +editionsByUser.toString()+ " is found and marked as busy.");
                return;
            }
        }
        System.out.println("Edition is not found");

    }
}
