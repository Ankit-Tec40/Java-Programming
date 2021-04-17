interface demoano2{
    void meth1(int a);
}


public class Lambda {

    public static void main(String[] args) {
        demoano2 obj=(a)->{ System.out.println("meth1"+a);}; //lambda
        obj.meth1(7);
    }
}
