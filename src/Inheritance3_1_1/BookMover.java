package Inheritance3_1_1;

public class BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Статус перемещения: " + book.getTitle()
                + " из " + book.getStatus() + " в " + requestedStatus);
    }

    protected void statusImpossible (Book book, Status requestedStatus){
        System.out.println("Перевод книги из статуса " + book.getStatus() +
                " в статус " + requestedStatus + " невозможен!");
    }

    protected void statusSame (Book book) {
        System.out.println("Книга уже имеет статус " + book.getStatus());
    }

    protected void statusUpdated (Book book, Status requestedStatus) {
        book.setStatus(requestedStatus);
        System.out.println("Книге присвоен статус " + requestedStatus);
    }
}
