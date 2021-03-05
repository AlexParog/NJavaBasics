package Polymorphism3_2_1.player;

import Polymorphism3_2_1.weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Machine(),
                new Pistol(),
                new RPG(),
                new Slingshot(),
                new WaterGun(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public boolean checkArray(int index) {
        return index >= 0 && index < getSlotsCount();
    }

    public void shotWeapon(int slot) {
        if (!checkArray(slot)){
            System.out.println("Такого слота не существует");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
