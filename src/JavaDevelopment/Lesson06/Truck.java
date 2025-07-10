package JavaDevelopment.Lesson06;

public class Truck extends Car{
    public int wheelsAmount;
    public double maxWeight = 9.7;

    public Truck(int w, String m, char c, float s, int wheelsAmount, double maxWeight) {
        super(w, m, c, s);
        this.wheelsAmount = wheelsAmount;
        this.maxWeight = maxWeight;
    }

    public void newWheels (int wheelsAmountNew) {
        this.wheelsAmount = wheelsAmountNew;
        System.out.println("Новое количество колес грузовика: " + this.wheelsAmount);
    }

}
