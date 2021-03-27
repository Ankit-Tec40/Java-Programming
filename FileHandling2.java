import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
    //write to file
    public static void main(String[] args) throws IOException {
    FileWriter writefile=new FileWriter("FH1.txt"); 
    writefile.write("Hlo i an ankit kumar"); 
    writefile.close();     
    
    //read from file
    File myfile=new File("FH1.txt");
    try {
        Scanner sc=new Scanner(myfile);
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
        sc.close();
        }

    } catch (Exception e) {
        System.out.println("exception");
    }
    



    }
    
}
