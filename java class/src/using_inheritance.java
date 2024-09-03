interface Pet {
    void pet();
}

interface Pet1 {
    void pet1();
}

class TestTt implements Pet, Pet1 {
    public void pet() {
        System.out.println("This is method of Pet interface");
    }

    public void pet1() {
        System.out.println("This is method of Pet1 interface");
    }
    
    public static void main(String[] args) {
        Pet obj = new TestTt();
        Pet1 obj1 = new TestTt();
        
        obj.pet();
        obj1.pet1();
    }
}
