package Inheritance3_1_1;

public class FromArchievedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.ARCHIVED)) {
            super.moveToStatus(book, requestedStatus);
        }

        switch (requestedStatus) {
            case OVERDUED:
                statusImpossible(book, requestedStatus);
                break;
            case ARCHIVED:
                statusSame(book);
                break;
            case BORROWED:
                statusImpossible(book, requestedStatus);
                break;
            case AVAILABLE:
                statusUpdated(book, requestedStatus);
                break;
        }
    }
}
