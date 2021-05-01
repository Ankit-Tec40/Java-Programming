interface camera {
    void takesnape();

    void recordvideo();

    default void recordin4k() {
        System.out.println("recording in 4k resolution");
    }
}

interface wifi {
    String[] getnetworks();

    void connecttonetwork(String network);
}

class cellphone {
    void callnumber(int phonnumber) {
        System.out.println("calling to" + phonnumber);
    }

    void pickcall() {
        System.out.println("connecting......");
    }
}

class smartphone extends cellphone implements camera, wifi {
    public void takesnape() {
        System.out.println("taking snap");
    }

    public void recordvideo() {
        System.out.println("recording video");
    }

    public String[] getnetworks() {
        System.out.println("getting network");
        String[] networklist = { "abc", "def", "fgh" };
        return networklist;
    }

    public void connecttonetwork(String network) {
        System.out.println("connecting to" + network);
    }
}

public class InterfacesEX1 {
    public static void main(String[] args) {
        smartphone ob = new smartphone();
        String[] ar = ob.getnetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        ob.recordin4k();
    }

}
