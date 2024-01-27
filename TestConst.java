public class TestConst {

    int a =7, b=9;
    TestConst(){
        System.out.println("This is a test constructor");
    }

    TestConst(int a, int b){
        int c = a + b;
        System.out.println("The sum is " +c);
    }
}
