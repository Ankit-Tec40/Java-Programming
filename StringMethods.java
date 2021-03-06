
public class StringMethods 
{
    public static void main(String[] args) 
    {
        String name="My Name Is Ankit Kumar  ";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,9));
        System.out.println(name.replace("k","p"));
        System.out.println(name.replace("k","point"));
        System.out.println(name.startsWith("M"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a",5));
        System.out.println(name.lastIndexOf("it"));
        System.out.println(name.lastIndexOf("it", 15));
        System.out.println(name.equals("My Name Is Ankit Kumar  "));
        System.out.println(name.equalsIgnoreCase("my Name Is Ankit Kumar  "));

        

        
    }
}
