import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("Can vote");
                break;
            case 12:
                System.out.println("cant Vote");
                break;
            default:
                System.out.println("Not found");
        }
        sc.close();
    }
    
}
