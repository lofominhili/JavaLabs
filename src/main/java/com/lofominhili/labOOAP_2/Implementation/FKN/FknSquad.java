package com.lofominhili.labOOAP_2.Implementation.FKN;

import com.lofominhili.labOOAP_2.Interface.SquadCompositionFactory;
import com.lofominhili.labOOAP_2.Squad;

public class FknSquad extends Squad {

    private final SquadCompositionFactory squadCompositionFactory;

    public FknSquad(SquadCompositionFactory squadCompositionFactory) {
        this.squadCompositionFactory = squadCompositionFactory;
    }

    public SquadCompositionFactory getSquadCompositionFactory() {
        return squadCompositionFactory;
    }

    @Override
    public void regisrateSquad() {
        System.out.println("Registrating squad: " + name);
        singer = squadCompositionFactory.createSinger();
        dancer = squadCompositionFactory.createDancer();
        kappellMeister = squadCompositionFactory.createKappellMeister();
    }
}
