package gear.factory;

import gear.Armor;
import gear.Banner;
import gear.Weapon;

public class MordorGearFactory implements GearFactory {

    @Override
    public Weapon createWeapon() {
        return new Weapon("Heavy sword");
    }

    @Override
    public Weapon createLeaderWeapon() {
        return new Weapon("Horn");
    }

    @Override
    public Weapon createScoutWeapon() {
        return new Weapon("Bow");
    }

    @Override
    public Armor createArmor() {
        return new Armor("Steel armor");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Red eye");

    }
}
