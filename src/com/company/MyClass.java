package com.company;

public class MyClass {

    /**
     *  поля - состяние
     */
    private int x = 1;
    private int y = 1;
    private double z = 1.2;
    private String name;
    private boolean d = true;

    /**
     * методы - поведение
     */
    public int getX(){
        return x;
    }

    public void setX(int value){
        x = value;
    }

    public void setName(String nameValue){
        name = nameValue;
    }

    public String getName(){
        return name;
    }

}
