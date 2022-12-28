package com.solvd.tareas.reflection;

import com.solvd.tareas.linkedListCustom.LinkedListCustom;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedListCustom<String> testList = new LinkedListCustom<>();

        Field[] fields = testList.getClass().getFields();
        Constructor[] constructors = testList.getClass().getConstructors();
        Method[] methods = testList.getClass().getMethods();

        System.out.println("Fields: ");
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("\nConstructors: ");
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("\nMethods: ");
        Arrays.stream(methods).forEach(System.out::println);

        try{
            Method add = testList.getClass().getMethod("add", Object.class);
            Method print = testList.getClass().getMethod("print");
            Method delete = testList.getClass().getMethod("delete", Object.class);

            add.invoke(testList, "firstMember");
            add.invoke(testList, "secondMember");
            add.invoke(testList, "thirdMember");
            print.invoke(testList);
            delete.invoke(testList, "thirdMember");
            print.invoke(testList);

        } catch (InvocationTargetException |NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
