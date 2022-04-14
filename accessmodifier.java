
class MyEmployee {
    // private class
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class accessmodifier {
    public static void main(String[] args) {
        MyEmployee ansu = new MyEmployee();
        /*
         * ansu.id =18;
         * ansu.name= "anshul";
         */ // error private access modifire
        ansu.setName("anshul");
        System.out.println(ansu.getName());
    }
}
