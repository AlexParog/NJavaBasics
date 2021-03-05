package Inheritance3_1_1;

public class FromAvailableStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.AVAILABLE)) {
            super.moveToStatus(book, requestedStatus);
        }

        switch (requestedStatus) {
            case OVERDUED:
                statusImpossible(book, requestedStatus);
                break;
            case AVAILABLE:
                statusSame(book);
                break;
            case ARCHIVED:
                statusUpdated(book, requestedStatus);
                break;
            case BORROWED:
                statusUpdated(book, requestedStatus);
                break;
        }
    }
}