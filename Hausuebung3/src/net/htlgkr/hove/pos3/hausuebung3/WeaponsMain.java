package net.htlgkr.hove.pos3.hausuebung3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//name;combatType;damageType;damage;speed;strength;value
public class WeaponsMain {


    public static void main(String[] args) {
        //
    }

    public void scanFile() {
        try {
            Scanner scanner = new Scanner(new File("weapons.csv"));
            scanner.nextLine();
            List<Weapons> weaponsList = new ArrayList<>();
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
    }
}
