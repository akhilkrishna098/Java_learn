package Interface;

public class Circle implements Drawing{

    public void draw() {
        System.out.println("This is a Circle");
    }

    Circle(){
        System.out.println("Circle Constructor");
    }
}
