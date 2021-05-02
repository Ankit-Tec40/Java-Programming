import java.util.*;

public class ArrayDequeue1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.addFirst(456);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
