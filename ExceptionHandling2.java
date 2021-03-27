import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=745;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index and no");
        int ind=sc.nextInt();
        int num=sc.nextInt();
        sc.close();

        try{
            System.out.println("value is"+marks[ind]);
            System.out.println(marks[ind]/num);

        }
        catch(ArithmeticException e){
            System.out.println("exception occur arthematic");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception occur out of bond");
        }
        catch(Exception e){
            System.out.println("exception occur");
        }
    }
    
}
