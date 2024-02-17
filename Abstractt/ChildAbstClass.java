package Abstractt;

public class ChildAbstClass extends AbstClass{


    void testMethod1() {
        System.out.println("This is parent abst method call defined in child abst class");
    }

    ChildAbstClass(){
        System.out.println("This is child Abstract Constructor invoke");
    }
}
