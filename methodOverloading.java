public class methodOverloading {
    static void foo(){
        System.out.println("Good Morning");

    }
    static void foo(int a){
        System.out.println("Hello "+a);

    }

public static void main(String[] args) {
    foo();
    foo(8);
    
}
    
}
