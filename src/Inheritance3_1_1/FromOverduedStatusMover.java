package Inheritance3_1_1;

public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.OVERDUED)) {
            super.moveToStatus(book, requestedStatus);
        }

        switch (requestedStatus) {
            case BORROWED:
                statusImpossible(book, requestedStatus);
                break;
            case OVERDUED:
                statusSame(book);
                break;
            case ARCHIVED:
                statusUpdated(book, requestedStatus);
                break;
            case AVAILABLE:
                statusUpdated(book, requestedStatus);
                break;
        }
    }
}