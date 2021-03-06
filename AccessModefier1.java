class myemployee{
    private int id;
    private String name;
    public void setname(String n){
        name=n;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;

    }
    public String getname(){
        return name;
    }

}



public class AccessModefier1 {
    public static void main(String[] args) {
        myemployee ob=new myemployee();
        ob.setname("Ankit");
        System.out.println(ob.getname());
         


    
    }
    
}
