public class ExceptionFinallyBlock {
    public static int greet(){
        try{
            int a=5;
            int b=0;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("end of function");
        }
        return 0;
    }
    public static void main(String[] args) {
        greet();
    }
}
