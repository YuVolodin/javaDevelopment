package JavaDevelopment.Lesson06;

import java.util.Scanner;

public class Task04Super {
    Scanner scanner = new Scanner(System.in);
    protected static int input = 3;

    public Task04Super() {

    }

    public void inputMethod() {
        input = scanner.nextInt();

    }

    public int getInput() {
        return input;
    }
}
