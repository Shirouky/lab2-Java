package factory;

import com.github.javafaker.Faker;
import gear.factory.DolGuldurGearFactory;
import gear.factory.MistyMountainsGearFactory;
import ork.OrkBuilder;
import ork.Tribe;

public class MistyMountainsBuilderFactory implements OrkBuilderFactory {
    private OrkBuilder builder;

    @Override
    public OrkBuilder createOrkBuilder(String name) {
        Faker faker = new Faker();
        if (name.isBlank()) {
            name = faker.lordOfTheRings().character();
        }
        builder = new OrkBuilder(new MistyMountainsGearFactory(), name);
        builder.setTribe(Tribe.MISTY_MOUNTAINS);
        builder.setStrength(faker.random().nextInt(BasicStats.STRENGTH.getMin(), BasicStats.STRENGTH.getMax()));
        builder.setAgility(faker.random().nextInt((int) (BasicStats.AGILITY.getMax() * 0.3 + BasicStats.AGILITY.getMin()), (BasicStats.AGILITY.getMax())));
        builder.setHealth(faker.random().nextInt(BasicStats.HEALTH.getMin(), BasicStats.HEALTH.getMax()));
        builder.setIntellect(faker.random().nextInt(BasicStats.INTELLECT.getMin(), (int) (BasicStats.INTELLECT.getMax() * 0.5)));
        return builder;
    }
}
