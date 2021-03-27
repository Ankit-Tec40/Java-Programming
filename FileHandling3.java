import java.io.File;

public class FileHandling3 {
    public static void main(String[] args) {
        //delete file
        File myfile=new File("FH1.txt");
        if (myfile.delete()){
            System.out.println("file deleted");
        }
        else{
            System.out.println("error occur");
        }
    }
    
}
