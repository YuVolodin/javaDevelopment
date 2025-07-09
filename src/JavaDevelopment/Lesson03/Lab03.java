package JavaDevelopment.Lesson03;

public class Lab03 {
    public static void main(String[] args) {
        //Task 2
        SampleCar firstCar = new SampleCar(Colour.RED, "Lada", 3.6);
        firstCar.display();
        SampleCar secondCar = new SampleCar(Colour.WHITE, "BMW", 4.1);
        secondCar.display();

        // Task 3

        House firstHouse = new House();
        firstHouse.setHouse(3, 1980, "Гостиница");
        House secondHouse = new House();
        secondHouse.setHouse(9, 2005, "Жилой дом");

        firstHouse.getInfo();
        secondHouse.getInfo();

        // Task 4

        Tree firstTree = new Tree(3, "Береза", true);
        Tree secondTree = new Tree(40, "Дуб");
        Tree thirdTree = new Tree();
    }

}
