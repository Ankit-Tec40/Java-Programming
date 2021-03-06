
class abc{
    int a;
    abc(int v){
        a=v;

    }
    public int def(){
        return 1;
    }

}


public class ThisAndSuper {
    public static void main(String[] args) {
        abc ob= new abc(5);
        System.out.println(ob.def());
    }
    
}
