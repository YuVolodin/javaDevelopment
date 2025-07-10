package JavaDevelopment.Lesson06;

public class Client extends Human {
    public Client(String name, String familyName) {
        super(name, familyName);
    }
    public String bankName;

    public Client(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }
    public void getInfo (){
        System.out.println(getName());
        System.out.println(getFamilyName());
        System.out.println(bankName);
    }
}
