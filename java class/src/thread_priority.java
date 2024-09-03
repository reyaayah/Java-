public class thread_priority {
    public static void main(String[] args) {
        TestMultipriority1 m1=new TestMultipriority1();
        TestMultipriority1 m2=new TestMultipriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
class TestMultipriority1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}