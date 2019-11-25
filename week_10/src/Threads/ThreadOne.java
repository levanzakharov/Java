package Threads;

public class ThreadOne extends Thread{
    String name;
    int N;

    public ThreadOne(String name,int N) {
        this.name = name;
        this.N = N;
    }

    @Override
    public void run(){
        for (int i =0; i < N;i++){
            System.out.println(name);
        }
    }


}
