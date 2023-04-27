package com.lofominhili.labOOAP_2.Implementation.PMM;

import com.lofominhili.labOOAP_2.Implementation.PMM.PmmDancer;
import com.lofominhili.labOOAP_2.Implementation.PMM.PmmKappellMeister;
import com.lofominhili.labOOAP_2.Implementation.PMM.PmmSinger;
import com.lofominhili.labOOAP_2.Interface.Dancer;
import com.lofominhili.labOOAP_2.Interface.KappellMeister;
import com.lofominhili.labOOAP_2.Interface.Singer;
import com.lofominhili.labOOAP_2.Interface.SquadCompositionFactory;

public class PmmSquadCompositionFactory implements SquadCompositionFactory {
    @Override
    public Singer createSinger() {
        return new PmmSinger();
    }

    @Override
    public Dancer createDancer() {
        return new PmmDancer();
    }

    @Override
    public KappellMeister createKappellMeister() {
        return new PmmKappellMeister();
    }
}
