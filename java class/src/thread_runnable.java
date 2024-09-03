public class thread_runnable {
    public static void main(String[] args) throws Exception{
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running.");
    }
}