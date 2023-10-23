public abstract class Editions extends Library implements  Detailable {
    protected boolean avable = true;
    public boolean isAvable() {
        return avable;
    }

    public void setAvable(boolean avable) {
        this.avable = avable;
    }

    public void book() {
        if(avable){
            setAvable(false);
        }
        else{
            System.out.println("Edition not available");
        }
    }
    public void returnToLibrary(){
        avable =true;
        System.out.println("Edition now is available");
    }
}
