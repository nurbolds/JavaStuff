package com.company;

public class MyClass {

    /**
     *  поля - состяние
     */
    private int x;
    private int y;
    private String name;

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
