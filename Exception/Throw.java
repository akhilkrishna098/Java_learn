package Exception;

// public class Throw {
//     public static void main(String[] args) {

//         validate(13);

//     }
//     public static void validate(int a) {
//         if(a<18){
//         throw new ArithmeticException("Ineligible to vote");
//         }
//         else 
//         System.out.println("Eligible to vote");
       

//     }
// }

// package Threadss;

// public class SampleThread extends Thread{
//     int a;
//     SampleThread(int a){
//         this.a =a;
//     }


//         public void run(){
//         for (int i=0;i<10;i++){
//             System.out.println("count :" + i +"thread : " +a);

//             try{
//                 Thread.sleep(1000);
//             }
//             catch (Exception e){
//                 System.out.println("exception");
//             }

//         }
//     }

//     public static void main(String[] args) {
//         SampleThread st1 =new SampleThread(1);
//         SampleThread st2 =new SampleThread(2);
//         SampleThread st3 =new SampleThread(3);
//         st1.start();
//         st2.start();
//         st3.start();
//     }
// }
