package com.lofominhili.lab_5;

import com.lofominhili.lab_5.interfaces.Interface1;
import com.lofominhili.lab_5.interfaces.Interface2;

public class SomeBean {
    @AutoInjectable
    private Interface1 interface1;
    @AutoInjectable
    private Interface2 interface2;

    public void foo() {
        interface1.printA();
        interface2.printB();
    }

}
