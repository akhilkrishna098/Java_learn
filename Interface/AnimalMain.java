package Interface;

public class AnimalMain implements Animal1,Animal2{


    AnimalMain(){
        System.out.println("Animal Main Constructor");
    }
    public void run() {
        System.out.println("Animals Run");
    }

    public void eat() {
        System.out.println("Animals Eat");
    }


    public static void main(String[] args) {
        AnimalMain am1 = new AnimalMain();
        am1.eat();
        am1.run();
    }
}


