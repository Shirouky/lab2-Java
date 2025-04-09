package ork.builder;

import gear.factory.GearFactory;
import gear.Armor;
import gear.Banner;
import gear.Weapon;
import ork.Ork;
import ork.Tribe;

public class OrkBuilder {
    private final String name;
    private Weapon weapon;
    private Armor armor;
    private Banner banner;
    protected Tribe tribe;

    protected int strength;
    protected int agility;
    protected int intellect;
    protected int health;
    private final GearFactory gearFactory;

    public OrkBuilder(GearFactory gearFactory, String name) {
        this.gearFactory = gearFactory;
        this.name = name;
    }

    public void setTribe() {
    }

    public void setStrength() {
    }

    public void setAgility() {
    }

    public void setHealth() {
    }

    public void setIntellect() {
    }

    public void setWeapon() {
        this.weapon = this.gearFactory.createWeapon();
    }

    public void setLeaderWeapon() {
        this.weapon = this.gearFactory.createLeaderWeapon();
    }

    public void setScoutWeapon() {
        this.weapon = this.gearFactory.createScoutWeapon();
    }

    public void setArmor() {
        this.armor = this.gearFactory.createArmor();
    }

    public void setBanner() {
        this.banner = this.gearFactory.createBanner();
    }

    public Ork getResult() {
        return new Ork(name, weapon, armor, banner, tribe, strength, agility, health, intellect);
    }
}
