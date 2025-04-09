package ork.builder;

import com.github.javafaker.Faker;
import factory.BasicStats;
import gear.factory.GearFactory;
import ork.Tribe;

public class MordorBuilder extends OrkBuilder {
    private final Faker faker = new Faker();

    public MordorBuilder(GearFactory gearFactory, String name) {
        super(gearFactory, name);
    }

    @Override
    public void setAgility() {
        this.agility = faker.random().nextInt(BasicStats.AGILITY.getMin(), (int) (BasicStats.AGILITY.getMax() * 0.4));
    }

    @Override
    public void setTribe() {
        this.tribe = Tribe.MORDOR;
    }

    @Override
    public void setHealth() {
        this.health = faker.random().nextInt(BasicStats.HEALTH.getMin(), BasicStats.HEALTH.getMax());
    }

    @Override
    public void setIntellect() {
        this.intellect = faker.random().nextInt(BasicStats.INTELLECT.getMin(), BasicStats.INTELLECT.getMax());
    }

    @Override
    public void setStrength() {
        this.strength = faker.random().nextInt((int) (BasicStats.STRENGTH.getMax() * 0.3 + BasicStats.STRENGTH.getMin()), BasicStats.STRENGTH.getMax());
    }
}
