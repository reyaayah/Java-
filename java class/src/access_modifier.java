public class access_modifier {
    public static void main(String[] args) throws Exception{
        Data d= new Data();
        d.setName("Riya");
        System.out.println(d.getName());
    }
}
class Data{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
