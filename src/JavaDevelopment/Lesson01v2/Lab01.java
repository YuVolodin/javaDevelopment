package JavaDevelopment.Lesson01v2;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Task 01
        System.out.println("Task01");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //Task02
        System.out.println("Task02");

        double x = (46 + 10)*((double)10/3);
        double y = 29*4*(-15);
        System.out.println("(46 + 10)*(10/3) = " + x);
        System.out.println("29*4*(-15) = " + y);

        //Task03
        System.out.println("Task03");

        var number = 10500;
        var result = (number/10)/10;
        System.out.println(result);

        //Task04
        System.out.println("Task04");

        var a = 3.6;
        var b = 4.1;
        var c = 5.9;
        var resultFourthTask = a * b * c;
        System.out.println(resultFourthTask);

        //Task05
        System.out.println("Task05");

        int d;
        int e;
        int f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        d = scanner.nextInt();
        System.out.println("Введите второе число: ");
        e = scanner.nextInt();
        System.out.println("Введите третье число: ");
        f = scanner.nextInt();
        System.out.println("Вы ввели следующие числа: ");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
