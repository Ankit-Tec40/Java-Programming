interface demoano{
    void meth1();
    void meth2();
}
// class anonydemo implements demoano{
//     public void display(){
//         System.out.println("hello");
//     }

//     @Override
//     public void meth1() {
//         System.out.println("meth1");
        
//     }

//     @Override
//     public void meth2() {
//         System.out.println("meth2");
        
//     }
// }
public class AnonymousClass {
    public static void main(String[] args) {
        // anonydemo ob=new anonydemo();
        // ob.meth1();
        demoano ob=new demoano(){
            @Override
            public void meth1() {
                System.out.println("meth1");
                    
            }
            
            @Override
            public void meth2() {
                System.out.println("meth2");
                    
            }
        };
        ob.meth1();

    }
}
