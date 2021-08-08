import java.util.*;

public class Hashing1 {
    public static void main(String[] args) {
        HashSet<Integer> hs =new HashSet<>(6, 0.5f);
        hs.add(23);
        hs.add(65);
        hs.add(23);
        hs.add(10);
        System.out.println(hs);
        
    }
}