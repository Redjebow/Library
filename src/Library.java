import java.util.ArrayList;

public class Library {
    private String nameLibrary;
    private String adressLibrary;
    private String workingTime;
    private ArrayList<Editions> editionList;
    public void addEditionList(Editions edition){
        editionList.add(edition);
    }
    public void printList(){
        for(Editions edition: editionList){
            System.out.println(edition.toString());
        }
    }
    public void search(Editions editions){
        for(Editions editions1:editionList) {
            if (editions.equals(editions1)&& editions.avable) {
                editions.setAvable(false);
                System.out.println("Editions " +editions.toString()+ " is found and marked as busy.");
                return;
            }
        }
        System.out.println("Edition is not found");

            }


    public Library(String nameLibrary, String adressLibrary, String workingTime) {
        this.nameLibrary = nameLibrary;
        this.adressLibrary = adressLibrary;
        this.workingTime = workingTime;
        this.editionList=new ArrayList<>();
    }
    public Library() {
        this.nameLibrary = "Hristo Botev";
        this.adressLibrary = "Razgrad, bul. Aprilsko Vastanie";
        this.workingTime = "09:00 - 18:00";
        this.editionList=new ArrayList<>();
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

}
