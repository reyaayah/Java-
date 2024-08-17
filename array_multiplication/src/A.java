public class A {
    private A()  {  
}  
void display()  
{  
System.out.println("Private Constructor");  
}  
}
private class private_constructor  
{  
public static void main(String args[])  
{   
    A obj = new A();   
    obj.display();
}  
}  