package Polymorphism3_2_1.weapon;

public class WaterGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Вы выбрали: Водный пистолет" + "\nБуль, буль, буль!");
    }
}
