package gear.factory;

import gear.Armor;
import gear.Banner;
import gear.Weapon;

public interface GearFactory {

    Weapon createWeapon();

    Weapon createLeaderWeapon();

    Weapon createScoutWeapon();

    Armor createArmor();

    Banner createBanner();
}
