package ork;

import gear.Armor;
import gear.Banner;
import gear.Weapon;

import java.util.HashMap;


public class Ork {
    private final String name;
    private final Weapon weapon;
    private final Armor armor;
    private Banner banner;
    private final Tribe tribe;

    private int strength;
    private int agility;
    private int intellect;
    private int health;

    public Ork(String name, Weapon weapon, Armor armor, Banner banner, Tribe tribe, int strength, int agility, int health, int intellect) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.banner = banner;
        this.tribe = tribe;
        this.strength = strength;
        this.agility = agility;
        this.health = health;
        this.intellect = intellect;
    }

    public String getTribe() {
        return this.tribe.toString();
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Banner getBanner() {
        if (banner == null) banner = new Banner("None");
        return banner;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getHealth() {
        return health;
    }
}
