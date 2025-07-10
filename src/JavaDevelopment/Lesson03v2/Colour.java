package JavaDevelopment.Lesson03v2;

public enum Colour {
    GREEN("Зеленый"),
    RED("Красный"),
    WHITE("Белый"),
    YELLOW("Желтый");
    private final String сolour;

    Colour (String сolour) {
        this.сolour = сolour;
    }
    public String getСolour () {
        return сolour;
    }
}
