abstract class Utilities{
    abstract void display();
}
public class abstract_class {
    public static void main(String[] args) {
        Utilities p=new Utilities() {//annonymous inner class
            void display(){
                System.out.println("Good Morning");
            }
        };
        p.display();
    }
}
