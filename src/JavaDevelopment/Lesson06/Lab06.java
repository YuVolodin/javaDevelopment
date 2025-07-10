package JavaDevelopment.Lesson06;

public class Lab06 {
    public static void main(String[] args) {
        BankWorker John = new BankWorker("John", "Smith", "WarnerBros");
        John.getInfo();
        John.display();
        John.checkDatabase();
        John.issueCreditCard();

        Truck MAZ = new Truck(4,"maz", 'g', 60,4, 9.5);
        MAZ.outPut();

        Task05Main sup = new Task05Main();
        Task05notMain sub = new Task05notMain();
        System.out.println(sup.getInfo());
        System.out.println(sub.getInfo());
        System.out.println(Integer.parseInt(sup.getInfo())-16);




    }
}
