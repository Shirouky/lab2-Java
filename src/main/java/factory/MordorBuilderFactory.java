package factory;

import com.github.javafaker.Faker;
import gear.factory.MordorGearFactory;
import ork.OrkBuilder;
import ork.Tribe;

public class MordorBuilderFactory implements OrkBuilderFactory {
    private OrkBuilder builder;

    public OrkBuilder createOrkBuilder(String name) {
        Faker faker = new Faker();
        if (name.isBlank()) {
            name = faker.lordOfTheRings().character();
        }
        builder = new OrkBuilder(new MordorGearFactory(), name);
        builder.setTribe(Tribe.MORDOR);
        builder.setStrength(faker.random().nextInt((int) (BasicStats.STRENGTH.getMax() * 0.3 + BasicStats.STRENGTH.getMin()), BasicStats.STRENGTH.getMax()));
        builder.setAgility(faker.random().nextInt(BasicStats.AGILITY.getMin(), (int) (BasicStats.AGILITY.getMax() * 0.4)));
        builder.setHealth(faker.random().nextInt(BasicStats.HEALTH.getMin(), BasicStats.HEALTH.getMax()));
        builder.setIntellect(faker.random().nextInt(BasicStats.INTELLECT.getMin(), BasicStats.INTELLECT.getMax()));
        return builder;
    }
}
