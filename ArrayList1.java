import java.util.*;

public class ArrayList1{ 
    public static void main(String[] args) {
        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>();
        l2.add(62);
        l2.add(73);
        l2.add(82);
        l2.add(54);

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(7);
        l1.add(0,420);
        l1.add(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(37));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));
        l1.set(1,6576);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
