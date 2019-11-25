import Threads.*;

public class Main {

    public static void main(String[] args){
        ThreadTwo t3 = new ThreadTwo();
        Thread t3obj = new Thread(t3);
        t3obj.start();



//        ThreadOne t1 = new ThreadOne("Thread 1.1",5);
//        ThreadOne t2 = new ThreadOne("Thread 1.2",5);
//
//        t1.start();
//        t2.start();
//
//        t1.setPriority(3);
//        t2.setPriority(9);
//
//        try {
//            Thread.sleep(200);
//        }
//        catch (InterruptedException ex){
//            ex.printStackTrace();
//        }



        System.out.println("Thread Ended");
    }
}
