package Polymorphism3_2_1.weapon;

public class Slingshot extends Weapon {
    @Override
    public void shot() {
        System.out.println("Вы выбрали: Рогатку" + "\nРазве это оружие?");
    }
}
