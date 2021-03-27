public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            System.out.println("trying");
            try{
                System.out.println("trying 2");
            }
            catch(Exception e){
                System.out.println("exception 2");
            }
        }
        catch(Exception e){
            System.out.println("exception 1");
        }
    }
    
}
