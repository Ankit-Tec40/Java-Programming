import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        ListIterator<Integer> it=list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
 