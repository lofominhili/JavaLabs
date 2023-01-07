package com.lofominhili.lab_5;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            SomeBean bean = (SomeBean) new Injector().inject(new SomeBean());
            bean.foo();
        } catch (NoSuchFieldException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                 InstantiationException | IllegalAccessException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
