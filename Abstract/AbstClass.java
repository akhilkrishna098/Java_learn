package Abstract;

public abstract class AbstClass {

    AbstClass(){
        System.out.println("This is parent Abstract Constructor invoke");
    }

    abstract void testMethod1();

    void testMethod2(){
        System.out.println("This is normal method call of abst class");
    }

}
