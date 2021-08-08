import java.io.File;
import java.io.IOException;

public class FileHandling1 {
    public static void main(String[] args) {
        //create file
        File myfile=new File("FH1.txt");
        try {
            myfile.createNewFile();
        } 
        catch (IOException e) {
            System.out.println("unable to create file");
            e.printStackTrace();
        }
        
    }   
}
