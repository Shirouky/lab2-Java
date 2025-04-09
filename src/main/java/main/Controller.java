package main;

import factory.DolGuldurBuilderFactory;
import factory.MistyMountainsBuilderFactory;
import factory.MordorBuilderFactory;
import ork.Ork;
import ork.builder.OrkBuilder;
import ork.OrkDirector;
import ork.Tribe;

public class Controller {
    private final OrkDirector orkDirector = new OrkDirector();

    public Ork createBuilderFactory(String name, Tribe tribe, OrkType type) {
        OrkBuilder builder;
        switch (tribe) {
            case MORDOR -> builder = new MordorBuilderFactory().createOrkBuilder(name);
            case MISTY_MOUNTAINS -> builder = new MistyMountainsBuilderFactory().createOrkBuilder(name);
            case DOL_GULDUR -> builder = new DolGuldurBuilderFactory().createOrkBuilder(name);
            case null, default -> throw new NullPointerException();
        }

        switch (type){
            case BASIC -> orkDirector.constructBasic(builder);
            case SCOUT -> orkDirector.constructScout(builder);
            case LEADER -> orkDirector.constructLeader(builder);
            case null, default -> throw new NullPointerException();
        }

        return builder.getResult();
    }
}
