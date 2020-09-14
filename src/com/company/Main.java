package com.company;

public class Main {

    public static void main(String[] args) {
        int x, y=1;
        x=10;

        // System.out.println(x);

	    MyClass myObject = new MyClass();
	    MyClass myObject2 = new MyClass();

        // System.out.println(myObject.getX());
        // System.out.println(myObject2.getX());

        myObject.setX(5);
        myObject2.setX(25);

        // System.out.println(myObject.getX());
        // System.out.println(myObject2.getX());

        myObject.setX(65);
        // System.out.println(myObject.getX());

        /**
         * основные арифметические опреации
         */
        System.out.println(x*y);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);

        /**
         * ДЗ: 1. Создать класс "Car" с полями: диаметр колеса, максимальная скорость, цвет.
         *     2. Создать объект "геленаген" и "феррари." Распечатать на экране знаяения полей
         *        каждого объекта.
         */

        System.out.println("Значение х в объекте 1: "+myObject.getX());
        myObject.setName("ObjectName");

        System.out.println("Название объекта 1: "+myObject.getName());

    }
}
