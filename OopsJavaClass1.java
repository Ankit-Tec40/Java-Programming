class employee{
    int id;
    String name;
    void output(){
        System.out.println(id);
        System.out.println(name);
    }
    }
public class OopsJavaClass1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee ob=new employee(); //instating a new employee object
        ob.id=5;
        ob.name="ankit";
        ob.output();

    }
    
}
