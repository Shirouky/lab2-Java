package ork;

public class OrkDirector {
    public void constructBasic(Builder builder) {
        builder.setWeapon();
        builder.setArmor();
    }

    public void constructScout(Builder builder) {
        builder.setScoutWeapon();
        builder.setArmor();
    }

    public void constructLeader(Builder builder) {
        builder.setLeaderWeapon();
        builder.setArmor();
        builder.setBanner();
    }
}
