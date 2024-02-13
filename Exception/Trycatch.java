package Exception;

public class Trycatch {
    public static void main(String[] args) {
        try{
            //int data = 100/0;
            String S = "null";
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Final Block");
        }
    }
    
}
