package net.htlgkr.hove.pos3.hausuebung3;

import java.io.*;
import java.util.Scanner;

//name;combatType;damageType;damage;speed;strength;value
public class Weapons {
    public String weaponname;
    public String weaponcombatType;
    public String weapondamageType;
    public int weapondamage;
    public int weaponspeed;
    public int weaponstrength;
    public int weaponvalue;
    File file = new File("weapons.csv");


    public void scanFile() {
        try {
            Scanner scanner = new Scanner(new File("weapons.csv"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    public String getWeaponcombatType() {
        return weaponcombatType;
    }

    public void setWeaponcombatType(String weaponcombatType) {
        this.weaponcombatType = weaponcombatType;
    }

    public String getWeapondamageType() {
        return weapondamageType;
    }

    public void setWeapondamageType(String weapondamageType) {
        this.weapondamageType = weapondamageType;
    }

    public int getWeapondamage() {
        return weapondamage;
    }

    public void setWeapondamage(int weapondamage) {
        this.weapondamage = weapondamage;
    }

    public int getWeaponspeed() {
        return weaponspeed;
    }

    public void setWeaponspeed(int weaponspeed) {
        this.weaponspeed = weaponspeed;
    }

    public int getWeaponstrength() {
        return weaponstrength;
    }

    public void setWeaponstrength(int weaponstrength) {
        this.weaponstrength = weaponstrength;
    }

    public int getWeaponvalue() {
        return weaponvalue;
    }

    public void setWeaponvalue(int weaponvalue) {
        this.weaponvalue = weaponvalue;
    }
}
