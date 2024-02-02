package Interface;

import org.w3c.dom.css.Rect;

public class Rectangle implements Drawing{

    public void draw() {
        System.out.println("This is a rectangle");
    }

    Rectangle(){
        System.out.println("Rectangle Constructor");
    }
}
