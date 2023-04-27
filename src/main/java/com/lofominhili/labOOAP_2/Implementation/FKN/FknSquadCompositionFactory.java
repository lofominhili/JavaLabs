package com.lofominhili.labOOAP_2.Implementation.FKN;

import com.lofominhili.labOOAP_2.Interface.Dancer;
import com.lofominhili.labOOAP_2.Interface.KappellMeister;
import com.lofominhili.labOOAP_2.Interface.Singer;
import com.lofominhili.labOOAP_2.Interface.SquadCompositionFactory;

public class FknSquadCompositionFactory implements SquadCompositionFactory {
    @Override
    public Singer createSinger() {
        return new FknSinger();
    }

    @Override
    public Dancer createDancer() {
        return new FknDancer();
    }

    @Override
    public KappellMeister createKappellMeister() {
        return new FknKappellMeister();
    }
}
