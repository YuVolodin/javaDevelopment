package JavaDevelopment.Lesson02;


public class Lab02 {
    public static void main(String[] args) {
    var a = Calculator.Substraction(1,2);
    System.out.println(a);
    var b = Calculator.Multiply( 1.0, 2);
    System.out.println (b);

        Pencil marcoLong = new Pencil(9, true, "Marco");
        System.out.println(marcoLong.getLength() + ", " + marcoLong.getSharpness() + ", " + marcoLong.getProducer());
    }
}
