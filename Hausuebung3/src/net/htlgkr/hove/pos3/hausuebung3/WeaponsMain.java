package net.htlgkr.hove.pos3.hausuebung3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//name;combatType;damageType;damage;speed;strength;value
public class WeaponsMain {

    public static void main(String[] args) {

        Printable printable = (weaponsList) ->{
            for (int i = 0; i < weaponsList.size(); i++) {
                System.out.println(weaponsList.get(i));
            }
        };
    }

    public List<Weapons> scanFile() {
        List<Weapons> weaponsList = null;
        try {
            Scanner scanner = new Scanner(new File("weapons.csv"));
            scanner.nextLine();
            weaponsList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                int damage = Integer.parseInt(parts[3]);
                int speed = Integer.parseInt(parts[4]);
                int strength = Integer.parseInt(parts[5]);
                int value = Integer.parseInt(parts[6]);
                Weapons weapons = new Weapons(parts[0], parts[1], parts[2], damage, speed, strength, value);
                weaponsList.add(weapons);
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return weaponsList;
    }

    public void comaring(Weapons weapons1, Weapons weapons2) {
        /*ComparatorWeapons compareDamage = (damage1, damage2) -> {
            if (damage1 - damage2 > 0) {
                return 1;
            } else if (damage2 - damage1 > 0) {
                return -1;
            }
            return 0;
        };*/

        String compatType1 = weapons1.getWeaponcombatType();
        String compatType2 = weapons2.getWeaponcombatType();
        String damageType1 = weapons1.getWeapondamageType();
        String damageType2 = weapons2.getWeapondamageType();
        String name1 = weapons1.getWeaponname();
        String name2 = weapons2.getWeaponname();

       /* ComparatorWeapons copareAlphabeticly = (weapons1, weapons2) -> {
            if (!compatType1.equals(compatType2)) {

            } else {
                if (!damageType1.equals(damageType2)) {

                } else {
                    if (!name1.equals(name2)) {

                    }
                }
            }
        };*/

    }
}
