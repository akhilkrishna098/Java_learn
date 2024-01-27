package Inheritance;

public class Dog extends Animal{

//    void dogBark(){
//        System.out.println("Dog Barks");
//    }

    Dog(){
        System.out.println("This is child class construction call");
    }

    void display(){
        System.out.println("Child class fuction call");
        super.display();
    }

    void basedisplay(){
        super.display();
    }

    Dog(int a){
        super(10);
        System.out.println("This is child Arguement constructor");

    }
}
