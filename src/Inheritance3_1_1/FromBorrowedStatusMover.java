package Inheritance3_1_1;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.BORROWED)) {
            super.moveToStatus(book, requestedStatus);
        }

        switch (requestedStatus) {
            case OVERDUED:
                statusUpdated(book, requestedStatus);
                break;
            case BORROWED:
                statusSame(book);
                break;
            case AVAILABLE:
                statusUpdated(book, requestedStatus);
                break;
            case ARCHIVED:
                statusUpdated(book, requestedStatus);
                break;
        }
    }
}