//write a program to calculate percentage of a given student in cbse board exam.
//his marks from 5 subjects must be tajen as input from the keyboard (total marks=100)

import java.util.Scanner;
public class Exercise11 
{
    int maths,science,english,gk,computer;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        maths=sc.nextInt();
        science=sc.nextInt();
        english=sc.nextInt();
        gk=sc.nextInt();
        computer=sc.nextInt();
        sc.close();
    }
    void output()
    {
        System.out.println("Percentage = "+(((maths+science+english+gk+computer)*100)/500)+"%");
    }
    public static void main(String[] args) 
    {
        Exercise11 ob=new Exercise11();
        ob.input();
        ob.output();
    }
}
