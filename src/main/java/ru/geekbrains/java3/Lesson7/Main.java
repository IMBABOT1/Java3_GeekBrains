package ru.geekbrains.java3.Lesson7;

import ru.geekbrains.java3.Lesson7.Annotations.AfterSuite;
import ru.geekbrains.java3.Lesson7.Annotations.BeforeSuite;
import ru.geekbrains.java3.Lesson7.Annotations.Common;
import ru.geekbrains.java3.Lesson7.Annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    private static void start(Class c) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = c.getDeclaredMethods();
        List<Method> getters = new ArrayList<Method>();

        int beforeCount = 0;
        int afterCount = 0;

        for (Method m : methods){
            if (m.isAnnotationPresent(BeforeSuite.class)){
                beforeCount++;
            }else if (m.isAnnotationPresent(AfterSuite.class)){
                afterCount++;
            }
        }

        if (beforeCount > 1 || afterCount > 1){
            throw new RuntimeException("Not allowed more then one Anno for beforeSuite or afterSuite");
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(Common.class)) {
                getters.add(m);
            }
        }

        for (int i = 0; i < getters.size(); i++) {
            for (int j = 0; j < getters.size()-i-1; j++) {
                if (getters.get(j).getAnnotation(Common.class).priority() > getters.get(j + 1).getAnnotation(Common.class).priority()){
                    Method temp = getters.get(j);
                    getters.set(j, getters.get(j + 1));
                    getters.set(j + 1, temp);
                }
            }
        }
        Collections.reverse(getters);
        for (Method m : getters){
            m.invoke(null);
    }
}







    public static void main(String[] args) {
        try {
            start(TestClass.class);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
