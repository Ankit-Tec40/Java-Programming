
class A{
    public int a;
    public int name(){
        return 8;
    }
    public void method2(){
        System.out.println("class a");

    }


}

class B extends A {
    public void method3(){
        System.out.println("class b");
    }
    public void method2(){
        System.out.println("override method of class a");

    }

}


public class MethodOverriding {
    public static void main(String[] args) {
        A ob=new A();
        ob.method2();
        B ob2=new B();
        ob2.method3();
        ob2.method2();

    }
    
}
