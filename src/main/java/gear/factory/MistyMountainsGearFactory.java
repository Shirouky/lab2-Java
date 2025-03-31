package gear.factory;

import gear.Armor;
import gear.Banner;
import gear.Weapon;

public class MistyMountainsGearFactory implements GearFactory {

    @Override
    public Weapon createWeapon() {
        return new Weapon("Axe");
    }

    @Override
    public Weapon createLeaderWeapon() {
        return new Weapon("Trumpet");
    }

    @Override
    public Weapon createScoutWeapon() {
        return new Weapon("Crossbow");
    }

    @Override
    public Armor createArmor() {
        return new Armor("Leather armor");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Moon");

    }
}
