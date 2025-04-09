package factory;

import gear.factory.MistyMountainsGearFactory;
import ork.builder.OrkBuilder;

public class MistyMountainsBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder(String name) {
        return new OrkBuilder(new MistyMountainsGearFactory(), name);
    }
}
