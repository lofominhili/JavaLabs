package com.lofominhili.lab_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Injector {
    private final Properties properties;

    public Injector() throws IOException {
        properties = new Properties();
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("src/main/resources/app.properties");
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert stream != null;
            stream.close();
        }
    }

    public Object inject(Object object) throws NoSuchFieldException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(AutoInjectable.class)) {
                Field f = object.getClass().getDeclaredField(field.getName());
                f.setAccessible(true);
                f.set(object, Class.forName(properties.getProperty(f.getType().getName())).getConstructor(null).newInstance());
            }
        }
        return object;
    }

}
