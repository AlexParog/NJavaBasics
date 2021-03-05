package AbstractionAndInterfaces3_3.task1;

public class UsLibrarian extends User implements Librarian, Reader, Administrator {
    public UsLibrarian(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Библиотекарь " + getName() + " выявил просрочку возврата книги у читателя " + reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказал книгу у поставщика " + supplier);
    }

    @Override
    public void receiveBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " получил от поставщика книги ");
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Библиотекарь " + getName() + " взял в использование книгу у администратора " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Библиотекарь " + getName() + " вернул администратору книгу " + administrator);
    }
}
