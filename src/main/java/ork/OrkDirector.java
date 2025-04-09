package ork;

import ork.builder.OrkBuilder;

public class OrkDirector {
    public void constructBasic(OrkBuilder builder) {
        builder.setTribe();
        builder.setHealth();
        builder.setAgility();
        builder.setIntellect();
        builder.setStrength();
        builder.setWeapon();
        builder.setArmor();
    }

    public void constructScout(OrkBuilder builder) {
        builder.setTribe();
        builder.setHealth();
        builder.setAgility();
        builder.setIntellect();
        builder.setStrength();
        builder.setScoutWeapon();
        builder.setArmor();
    }

    public void constructLeader(OrkBuilder builder) {
        builder.setTribe();
        builder.setHealth();
        builder.setAgility();
        builder.setIntellect();
        builder.setStrength();
        builder.setLeaderWeapon();
        builder.setArmor();
        builder.setBanner();
    }
}
