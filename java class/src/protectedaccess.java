public class protectedaccess extends Animal{
    public static void main(String[] args) {
        protectedaccess dog= new protectedaccess();
        dog.display();
    }
}
class Animal{
    protected void display(){
        System.out.println("I am an animal");
    }
}

