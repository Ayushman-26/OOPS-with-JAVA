class SuperClass {
    private String privateMember = "This is a private member";
    public String getPrivateMember() {
        return privateMember;
    }
}
class SubClass extends SuperClass {
    public void display() {
        System.out.println("Accessing private member through method: " + getPrivateMember());
    }
}
public class Main {
    public static void main(String[] args) {
        
        SubClass obj = new SubClass();
        obj.display();
        //System.out.println(privateMember);
    }
}
