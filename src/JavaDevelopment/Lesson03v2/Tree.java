package JavaDevelopment.Lesson03v2;

public class Tree {
    public int age;
    public String name;
    public boolean isAlife;


    public Tree(int age, String name, boolean isAlife) {
        this.age = age;
        this.name = name;
        this.isAlife = isAlife;
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
