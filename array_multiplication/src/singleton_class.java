public class singleton_class {
    public static void main(String[] args) {
        SingletonClass s =SingletonClass.objectCreationMethod();
        s.display();
    } 
}
class SingletonClass{
    private static SingletonClass obj=null;
    private SingletonClass(){
        
    }
    public static SingletonClass objectCreationMethod(){
        if(obj==null){
            obj=new SingletonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("SingletonClass Example");
    }
}