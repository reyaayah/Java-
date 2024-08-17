public class baseclass_using_super {
    public static void main(String[] args) throws Exception {
        ChildClass cls=new ChildClass();
    }
}
class BaseClass{
    BaseClass(){
        System.out.println("Base Class Constructor is Called");
    }
}
class ChildClass  extends BaseClass{
    ChildClass(){
        super();
        System.out.println("From Base Class COnstructor");
    }
}

