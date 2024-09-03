public class multiple_inheritance{
    public static void main(String[] args) {
        Animals a=new Animals();
        a.eat1();
        a.eat2();
    }
    
}
interface IAnimals {
    void eat1();
}
abstract class JAnimals {
    abstract void eat2();
    
}

class Animals extends JAnimals implements IAnimals{
  
    public void eat1()
     { System.out.println("Animal1 ia eating"); }
     public void eat2() 
     { 
         System.out.println("Animal 2 is eatoing");
  }
}