package PatternPrint;

public class Star {
//    public static void main(String[] args) {
//        for(int i = 1; i<=3; i++){
//            for(int j = 1; j<=5 ; j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }

    public static void main(String[] args) {
        for(int i = 1 ; i <= 3; i++){
            for(int j=1 ; j < i+1; j++){
                for( int n = 3 ; n > 0 ; n--){
                    System.out.print("\t");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

