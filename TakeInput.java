import java.util.Scanner;
public class TakeInput 
{
    public static void main(String[] args) 
    {
        System.out.println("Taking input");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no 1");
        int a=sc.nextInt();
        System.out.println("enter no 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is="+sum);
        sc.close();
    }
}
