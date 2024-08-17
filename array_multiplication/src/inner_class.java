public class inner_class {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.show();
    }
}
class Outer{
    class Inner{ //local inner class
        public void show(){
            System.out.println("In a nested class method");
        }
    }
}
