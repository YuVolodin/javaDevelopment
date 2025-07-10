package JavaDevelopment.Lesson06;

public interface Bank {
    public default void checkDatabase() {
        System.out.println("База данных проверена");

    }
    public default void issueCreditCard() {
        System.out.println("Кредитная карта выпущена");

    }

}
