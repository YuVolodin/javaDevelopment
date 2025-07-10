package JavaDevelopment.Lesson05;

public class Main {
    public static void main(String[] args) {
        String str = "Бар Пол гаечный бетон варан";
        Lab05.longWord(str);
        System.out.println(Lab05.longWord(str));
        String word = "Это было только одно лето, но оно запомнилось на всю жизнь";
        Lab05.isPolyndrome(word);
        String secondString = "Лето в этом году наступило внезапно, как будто пробудившись ото сна";
        Lab05.checkEquality(word, secondString);
        Lab05.reverseString("Это было только одно лето, но оно запомнилось на всю жизнь");
        Lab05.censored("кулебяка");



    }
}
