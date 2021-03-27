interface bicycle{
    int a=45;
    void applybreak(int dec);
    void speedup(int inc);
}

class Avoncycle implements bicycle{
    void horn(){
        System.out.println("Horn");
    }
    public void applybreak(int dec){
        System.out.println("Decreasing speed");

    }
    public void speedup(int inc){
        System.out.println("Speed up");
    }
}


public class interfaces {
    public static void main(String[] args) {
        Avoncycle ob=new Avoncycle();
        ob.applybreak(1);
        //System.out.println(ob.a);
    }
    
}
