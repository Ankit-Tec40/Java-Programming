
class base{
    int x; 
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("hello"+getX());

    }


}

class derived extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void printme2(){
        System.out.println("hello"+getY());

    }



}



public class Inheritance1 {
    public static void main(String[] args) {
        derived ob=new derived();
        ob.setX(8);
        ob.getX();
        ob.printme();
        ob.setY(89);
        ob.getY();
        ob.printme2();
        

        
    }
    
}
