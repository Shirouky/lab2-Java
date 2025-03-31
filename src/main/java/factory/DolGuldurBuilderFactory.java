package factory;

import com.github.javafaker.Faker;
import gear.factory.DolGuldurGearFactory;
import ork.OrkBuilder;
import ork.Tribe;

public class DolGuldurBuilderFactory implements OrkBuilderFactory {
    private OrkBuilder builder;

    @Override
    public OrkBuilder createOrkBuilder(String name) {
        Faker faker = new Faker();
        if (name.isBlank()) {
            name = faker.lordOfTheRings().character();
        }
        builder = new OrkBuilder(new DolGuldurGearFactory(), name);
        builder.setTribe(Tribe.DOL_GULDUR);
        builder.setStrength(faker.random().nextInt(BasicStats.STRENGTH.getMin(), BasicStats.STRENGTH.getMax()));
        builder.setAgility(faker.random().nextInt(BasicStats.AGILITY.getMin(), (BasicStats.AGILITY.getMax())));
        builder.setHealth(faker.random().nextInt(BasicStats.HEALTH.getMin(), BasicStats.HEALTH.getMax()));
        builder.setIntellect(faker.random().nextInt(BasicStats.INTELLECT.getMin(), BasicStats.INTELLECT.getMax()));
        return builder;
    }
}
