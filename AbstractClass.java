// abstract=khalyali pulao
abstract class parent2{
    public parent2(){
        System.out.println("base case constructor");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child2 extends parent2{
    public void greet(){
    System.out.println("good morning"); 
    }
}

abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        
    }
    
}
