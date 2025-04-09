package factory;

import com.github.javafaker.Faker;
import gear.factory.MistyMountainsGearFactory;
import ork.builder.MistyMountainsBuilder;
import ork.builder.OrkBuilder;

public class MistyMountainsBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder(String name) {
        Faker faker = new Faker();
        if (name.isBlank()) {
            name = faker.lordOfTheRings().character();
        }
        return new MistyMountainsBuilder(new MistyMountainsGearFactory(), name);
    }
}
