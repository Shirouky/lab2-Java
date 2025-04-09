package factory;

import com.github.javafaker.Faker;
import gear.factory.DolGuldurGearFactory;
import ork.builder.DolGuldurBuilder;
import ork.builder.OrkBuilder;

public class DolGuldurBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder(String name) {
        Faker faker = new Faker();
        if (name.isBlank()) {
            name = faker.lordOfTheRings().character();
        }
        return new DolGuldurBuilder(new DolGuldurGearFactory(), name);
    }
}
