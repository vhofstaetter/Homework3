package net.htlgkr.hove.pos3.hausuebung3;

import java.util.Comparator;
import java.util.Objects;

public class Weapons {
    public String weaponname;
    public String weaponcombatType;
    public String weapondamageType;
    public int weapondamage;
    public int weaponspeed;
    public int weaponstrength;
    public int weaponvalue;

    public Weapons(String weaponname, String weaponcombatType, String weapondamageType, int weapondamage, int weaponspeed, int weaponstrength, int weaponvalue) {
        this.weaponname = weaponname;
        this.weaponcombatType = weaponcombatType;
        this.weapondamageType = weapondamageType;
        this.weapondamage = weapondamage;
        this.weaponspeed = weaponspeed;
        this.weaponstrength = weaponstrength;
        this.weaponvalue = weaponvalue;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public String getWeaponcombatType() {
        return weaponcombatType;
    }

    public String getWeapondamageType() {
        return weapondamageType;
    }

    public int getWeapondamage() {
        return weapondamage;
    }

    public int getWeaponspeed() {
        return weaponspeed;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weapons)) return false;
        Weapons weapons = (Weapons) o;
        return getWeapondamage() == weapons.getWeapondamage() && getWeaponspeed() == weapons.getWeaponspeed() && getWeaponstrength() == weapons.getWeaponstrength() && getWeaponvalue() == weapons.getWeaponvalue() && Objects.equals(getWeaponname(), weapons.getWeaponname()) && Objects.equals(getWeaponcombatType(), weapons.getWeaponcombatType()) && Objects.equals(getWeapondamageType(), weapons.getWeapondamageType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeaponname(), getWeaponcombatType(), getWeapondamageType(), getWeapondamage(), getWeaponspeed(), getWeaponstrength(), getWeaponvalue());
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + weaponname + ", combatType=" + weaponcombatType + ", damageType=" + weapondamageType + ", damage=" + weapondamage + ", speed=" + weaponspeed + ", minStrength=" + weaponstrength + ", value=" + weaponvalue + '}';
    }
}
