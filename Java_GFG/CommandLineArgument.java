public class CommandLineArgument {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("argument is");
            for(String x: args){
                System.out.println(x+"");

            }
          }
          else{
            System.out.println("no argument");
        
        }
    }
}
