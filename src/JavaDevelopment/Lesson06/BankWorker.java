package JavaDevelopment.Lesson06;

public class BankWorker extends Human implements Bank{
    public BankWorker(String name, String familyName) {
        super(name, familyName);
    }
    public String bankName;

    public BankWorker(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }

    public void getInfo (){
        System.out.println(getName());
        System.out.println(getFamilyName());
        System.out.println(bankName);
    }

    @Override
    public void checkDatabase() {
        Bank.super.checkDatabase();
    }

    @Override
    public void issueCreditCard() {
        Bank.super.issueCreditCard();
    }
}
