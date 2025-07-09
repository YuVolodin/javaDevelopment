package JavaDevelopment.Lesson03;

import java.time.LocalDate;

public class House {
     int floorNumber;
     int foundYear;
     String name;

    public void setHouse(int floorNumber, int foundYear, String name) {
        this.floorNumber = floorNumber;
        this.foundYear = foundYear;
        this.name = name;
    }


    public int getFloorNumber() {
        return floorNumber;
    }

    public int getFoundYear() {
        return foundYear;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("Кол-во этажей: " + this.getFloorNumber());
        System.out.println("Построен в " + this.getFoundYear());
        System.out.println("Был построен " + this.countYears() + " назад");
        System.out.println("Название объекта: " + this.getName());
    }

    public int countYears () {
        int years;
        LocalDate date = LocalDate.now();
        int currentYear = date.getYear();
        years = currentYear - this.getFoundYear();

        return years;
    }

}
