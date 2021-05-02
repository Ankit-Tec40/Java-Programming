public class Test{
    public static void main(String[] args) {
        int a=7;
        if(a>4){
            try{
                throw new Exception();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class exp extends Exception{
    @Override
    public String toString() {
        return "to str";
    }
    @Override
    public String getMessage() {
        return "exp message";
    }

}