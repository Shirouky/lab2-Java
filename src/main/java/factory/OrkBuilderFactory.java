package factory;

import ork.builder.OrkBuilder;

public interface OrkBuilderFactory {
    OrkBuilder createOrkBuilder(String name);
}
