package com.lukman;

public class objectsandreferences {
    objectsandreferences()
    {
        System.out.println(" i am a constructor");
    }
    public void name()
    {
        System.out.println("name");
    }
    public objectsandreferences age()
    {
        System.out.println(20);
        return null;
    }
    public void rollno()
    {
        System.out.println("0191AL201027");
    }
    public void address()
    {
        System.out.println("shahdol distt-Madhaya Pradesh");
    }
    public static void main(String[] args) {
        
        objectsandreferences obj1 = new objectsandreferences();
        objectsandreferences obj2 = new objectsandreferences();
        objectsandreferences obj3 = new objectsandreferences();
        objectsandreferences obj4 = new objectsandreferences();
        objectsandreferences obj5 = new objectsandreferences();
        objectsandreferences[] objects = new objectsandreferences[]{obj1.age(),obj2,obj3,obj4,obj5};
        for (objectsandreferences obj22 : objects) {
            System.out.println(obj22);
        }
    }
}
