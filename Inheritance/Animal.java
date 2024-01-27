package Inheritance;

public class Animal {

//    void Eat(){
//        System.out.println("Eats");
//    }
//
//    void Pet(){
//        System.out.println("Pet");
//    }

    Animal(){
        System.out.println("This is parent class Constructor call");
    }
    void display(){
        System.out.println("Parent class display function");
    }

    Animal(int a){
        System.out.println("This is parent Arguement Constructor");
    }
}
