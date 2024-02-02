package Interface;

public class PrintMsg implements Printable.Message{


    public void msg() {
        System.out.println("This is the message of message Interface");
    }

    public void print(){
        System.out.println("This is the message from print Interface");
    }

    public static void main(String[] args) {
        PrintMsg pm1 = new PrintMsg();
        pm1.msg();
        pm1.print();
    }
}
