package gear.factory;

import gear.Armor;
import gear.Banner;
import gear.Weapon;

public class DolGuldurGearFactory implements GearFactory {

    @Override
    public Weapon createWeapon() {
        return new Weapon("Spear");
    }

    @Override
    public Weapon createLeaderWeapon() {
        return new Weapon("Drum");
    }

    @Override
    public Weapon createScoutWeapon() {
        return new Weapon("Lasso");
    }

    @Override
    public Armor createArmor() {
        return new Armor("Chainmail");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Spider");
    }
}
