public class anonymous_thread {
    public static void main(String[] args)throws Exception {
        Thread t=new Thread(){
            public void run(){
                System.out.println("Thread is running");
            }
        };
       t.start();
    }
   
}
