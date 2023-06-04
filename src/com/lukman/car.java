package com.lukman;

//class Adder{
//    static int add(int a,int b){return a+b;}
//    static int add(int a,int b,int c){return a+b+c;}
//}
//class TestOverloading1{
//    public static void main(String[] args){
//        System.out.println(Adder.add(11,11,15));
//        System.out.println(Adder.add(11,11));
//    }
//}

class Vehicle{
    Vehicle()
    {
        System.out.println("Vehicle is running");
    }
}
//Creating a child class
class Bike extends Vehicle{
    int data=4;
    String s="anish1";
    void ride(int data,String s)
    {
        System.out.println(data+s);
    }
}
 class cutm extends Bike{
    void ride()
    {
        System.out.println("riding in cutm");
    }
        public static void main(String args[]){
            //creating an instance of child class
            cutm c= new cutm();
            c.ride();
            Bike b =new Bike();
            b.ride(3,"anish");
            //calling the method with child class instanc
           Vehicle v= new Vehicle();

        }
    }
