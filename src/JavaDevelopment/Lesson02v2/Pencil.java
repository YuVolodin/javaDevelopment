package JavaDevelopment.Lesson02v2;


public class Pencil {
    double length;
    boolean isSharp;
    String Producer;
    public Pencil() {
        this.length = 5.5;
        this.isSharp = false;
        this.Producer = "Undefined";
    }

    public Pencil(double length, boolean isSharp, String Producer) {
        this.length = length;
        this.isSharp = isSharp;
        this.Producer = Producer;
    }

    public double getLength() {
        return length;
    }

    public String getSharpness() {
        String result;
        if (isSharp) {
            result = "Заточен";
        }
        else {
            result = "Не заточен";
        }

        return result;
    }

    public String getProducer() {
        return Producer;
    }
}
