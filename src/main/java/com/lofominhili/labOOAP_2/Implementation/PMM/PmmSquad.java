package com.lofominhili.labOOAP_2.Implementation.PMM;

import com.lofominhili.labOOAP_2.Interface.Singer;
import com.lofominhili.labOOAP_2.Interface.SquadCompositionFactory;
import com.lofominhili.labOOAP_2.Squad;

public class PmmSquad extends Squad {
    private final SquadCompositionFactory squadCompositionFactory;

    public PmmSquad(SquadCompositionFactory squadCompositionFactory) {
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
