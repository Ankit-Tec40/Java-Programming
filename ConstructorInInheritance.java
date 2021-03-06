

class base2{
    public int x;
    base2(int a){
        System.out.println("I am a Constructort"+a);


    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

}

class derived2 extends base2{
    public int y;
    derived2(){
        super(0); // calling argument wala constructor from base class
    
        System.out.println("I am derived class constructor");
    }
    public int getY() {
        return y;
    
    }
    public void setY(int y) {
        this.y = y;
    }
}





public class ConstructorInInheritance {
    public static void main(String[] args) {
        base2 ob=new base2(12);
        ob.setX(85);
        System.out.println(ob.getX());
        derived2 ob2=new derived2();
        ob2.setX(85);
        System.out.println(ob2.getX());
        ob2.setY(99);
        System.out.println(ob2.getY());
        


        
    }
    
}
