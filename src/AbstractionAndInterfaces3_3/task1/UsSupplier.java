package AbstractionAndInterfaces3_3.task1;

public class UsSupplier extends User implements Supplier, Reader{
    public UsSupplier(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Поставщик " + getName() + " взял почитать книгу у админа " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Поставщик " + getName() + " вернул книгу админу " + administrator);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик " + getName() + " привез книгу библиотекарю " + librarian);
    }
}
