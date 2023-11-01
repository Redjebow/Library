public class TestLibrary {
    public static void main(String[] args) {
        Editions book1 = new Book( "Book name 1", "Book author 1", 2000,100);
        Editions book2 = new Book();
        Editions np1 = new Newspaper();
        Editions np2 = new Newspaper("NPName", "12.12.12");
        Library lb1 = new Library();



        lb1.addEditionsList(book1);
        lb1.addEditionsList(book2);
        lb1.addEditionsList(np1);
        lb1.addEditionsList(np2);

        lb1.printList();
        System.out.println("*".repeat(10));
        System.out.println("Edition is avable in library: " +book1.isAvable());
        lb1.searchEditions(book1);
        System.out.println("Edition is avable in library: " +book1.isAvable());
        lb1.searchEditions(book1);
        System.out.println("Edition is avable in library: " +book1.isAvable());
        System.out.println("*".repeat(10));
        System.out.println("Edition is avable in library: " +np2.isAvable());
        np2.book();
        System.out.println("Edition is avable in library: " +np2.isAvable());
        np2.returnToLibrary();
        System.out.println("Edition is avable in library: " +np2.isAvable());





    }
}