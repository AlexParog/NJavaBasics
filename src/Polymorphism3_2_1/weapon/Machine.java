package Polymorphism3_2_1.weapon;

public class Machine extends Weapon {
    @Override
    public void shot() {
        System.out.println("Вы выбрали: Автомат" +"\nРатататата!");
    }
}
