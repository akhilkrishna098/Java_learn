package Thread;

public class ThreadRun3 extends Thread{

    public void run(){
    for(int k = 0 ; k <= 10; k++)
    {
    System.out.println("ThreadRun" +k);

    }
  }

  public static void main(String[] args) {
    new ThreadRun3().run();
    new ThreadRun2().run();
    new ThreadRun().run();
}
    
    
}
