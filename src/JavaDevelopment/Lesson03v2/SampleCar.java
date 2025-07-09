package JavaDevelopment.Lesson03v2;

public class SampleCar {
    public Colour colour;
    public String name;
    public double weight;

    public SampleCar(Colour Colour, String name, double weight) {
        this.colour = Colour;
        this.name = name;
        this.weight = weight;
    }

    public SampleCar(Colour colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public SampleCar(Colour colour) {
        this.colour = colour;
    }

    public SampleCar() {
    }


    public void display (){
        System.out.println("Цвет: " + this.colour.getСolour());
        System.out.println("Название: " + this.name);
        System.out.println("Вес: " + this.weight + " тонн");
    };


}
