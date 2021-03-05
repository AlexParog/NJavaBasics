package Polymorphism3_2_1.weapon;

public class RPG extends Weapon {
    @Override
    public void shot() {
        System.out.println("Вы выбрали: РПГ" + "\nБУМ!");
    }
}
