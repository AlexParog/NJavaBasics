package Polymorphism3_2_1.weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Вы выбрали: Пистолет" + "\nПив, пав, пав!");
    }
}
