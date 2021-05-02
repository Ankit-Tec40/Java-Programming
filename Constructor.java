
class myemployee2{
    private int id;
    private String name;

    public myemployee2(String myname) {
        id=78;
        name=myname;
        
    }

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



public class Constructor {
    public static void main(String[] args) {
        myemployee2 ob=new myemployee2("Ankit");
        
        System.out.println(ob.getname());
        


    }

    
}
