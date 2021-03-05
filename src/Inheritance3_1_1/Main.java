package Inheritance3_1_1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("'Триумфальная арка'", Status.AVAILABLE);

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println();

        BookMover fromArchiveStatusMover = new FromArchievedStatusMover();
        fromArchiveStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println();
        fromArchiveStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println();
        fromArchiveStatusMover.moveToStatus(book,Status.AVAILABLE);
        System.out.println();
        System.out.println("Статус: " + book.getStatus());
    }
}
