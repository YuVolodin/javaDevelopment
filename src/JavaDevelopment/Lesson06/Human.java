package JavaDevelopment.Lesson06;

public abstract class Human {
    private String name;
    private String familyName;

    public Human(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    protected void display(){
        System.out.println(name);
        System.out.println(familyName);
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }
}
