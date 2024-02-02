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

    //Right Angled Triangle
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//           for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }
    //Pyramid
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = 4; a >= 1; a--) {
            for (int b = a; b <= 4; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

