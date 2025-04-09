package factory;

import com.github.javafaker.Faker;
import gear.factory.MordorGearFactory;
import ork.builder.MordorBuilder;
import ork.builder.OrkBuilder;

public class MordorBuilderFactory implements OrkBuilderFactory {
    public OrkBuilder createOrkBuilder(String name) {
        Faker faker = new Faker();
        if (name.isBlank()) {
            name = faker.lordOfTheRings().character();
        }
        return new MordorBuilder(new MordorGearFactory(), name);
    }
}
