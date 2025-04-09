package ork.builder;

import com.github.javafaker.Faker;
import factory.BasicStats;
import gear.factory.GearFactory;
import ork.Tribe;

public class MistyMountainsBuilder extends OrkBuilder {
    private final Faker faker = new Faker();

    public MistyMountainsBuilder(GearFactory gearFactory, String name) {
        super(gearFactory, name);
    }

    @Override
    public void setAgility() {
        this.agility = faker.random().nextInt((int) (BasicStats.AGILITY.getMax() * 0.3 + BasicStats.AGILITY.getMin()), (BasicStats.AGILITY.getMax()));
    }

    @Override
    public void setTribe() {
        this.tribe = Tribe.MISTY_MOUNTAINS;
    }

    @Override
    public void setHealth() {
        this.health = faker.random().nextInt(BasicStats.HEALTH.getMin(), BasicStats.HEALTH.getMax());
    }

    @Override
    public void setIntellect() {
        this.intellect = faker.random().nextInt(BasicStats.INTELLECT.getMin(), (int) (BasicStats.INTELLECT.getMax() * 0.5));
    }

    @Override
    public void setStrength() {
        this.strength = faker.random().nextInt(BasicStats.STRENGTH.getMin(), BasicStats.STRENGTH.getMax());
    }
}
