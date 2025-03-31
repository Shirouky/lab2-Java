package ork;

import gear.factory.GearFactory;
import gear.Armor;
import gear.Banner;
import gear.Weapon;

public class OrkBuilder implements Builder {
    private final String name;
    private Weapon weapon;
    private Armor armor;
    private Banner banner;
    private Tribe tribe;

    private int strength;
    private int agility;
    private int intellect;
    private int health;
    private final GearFactory gearFactory;

    public OrkBuilder(GearFactory gearFactory, String name) {
        this.gearFactory = gearFactory;
        this.name = name;
    }

    @Override
    public void setTribe(Tribe tribe) {
        this.tribe = tribe;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    @Override
    public void setWeapon() {
        this.weapon = this.gearFactory.createWeapon();
    }

    @Override
    public void setLeaderWeapon() {
        this.weapon = this.gearFactory.createLeaderWeapon();
    }

    @Override
    public void setScoutWeapon() {
        this.weapon = this.gearFactory.createScoutWeapon();
    }

    @Override
    public void setArmor() {
        this.armor = this.gearFactory.createArmor();
    }

    @Override
    public void setBanner() {
        this.banner = this.gearFactory.createBanner();
    }

    public Ork getResult() {
        return new Ork(name, weapon, armor, banner, tribe, strength, agility, health, intellect);
    }
}
