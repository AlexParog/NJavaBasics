package AbstractionAndInterfaces3_3.task1;

public class UsAdministrator extends User implements Administrator, Reader{
    public UsAdministrator(String name){
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + getName() + " выявил просрочку возврата книги у читателя " + reader);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Администратор " + getName() + " взял в использование книгу");
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Администратор " + getName() + " вернул книгу");
    }
}
