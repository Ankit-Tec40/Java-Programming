// import java.util.ArrayList;

// public class generic {
//     public static void main(String[] args) {
//         ArrayList<Integer> al=new ArrayList<>();
//         al.add(656);
//         al.add(56);
//         al.add(87);
//         int a=al.get(2);
//         System.out.println(a);

//         gen <String> g1=new gen(234, "string hai");
//         String str=g1.getT1();
//         System.out.println(str);
//     }
// }


// class gen<T1>{
//     int val;
//     private T1 t1;
//     public gen(int val,T1 t1){
//         this.val=val;
//         this.t1=t1;
//     }
//     public T1 getT1() {
//         return t1;
//     }
//     public void setT1(T1 t1) {
//         this.t1 = t1;
//     }
//     public int getVal() {
//         return val;
//     }
//     public void setVal(int val) {
//         this.val = val;
//     }
// }