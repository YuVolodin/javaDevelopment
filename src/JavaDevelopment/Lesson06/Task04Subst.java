package JavaDevelopment.Lesson06;

public class Task04Subst extends Task04Super {
    public Task04Subst() {

    }



    public void giveSuperInput() {
        int result = super.getInput();
        System.out.println("Переменнная супер класса: " + result);
    }

}
