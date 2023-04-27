package com.lofominhili.labOOAP_2;

import com.lofominhili.labOOAP_2.Interface.Dancer;
import com.lofominhili.labOOAP_2.Interface.KappellMeister;
import com.lofominhili.labOOAP_2.Interface.Singer;

public abstract class Squad {
    protected String name;
    protected Singer singer;
    protected Dancer dancer;
    protected KappellMeister kappellMeister;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void regisrateSquad ();

    public void repetition(){
        System.out.println("There is a repetition....\n");
    }
}
