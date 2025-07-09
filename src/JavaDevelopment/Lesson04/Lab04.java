package JavaDevelopment.Lesson04;

import java.util.*;

public class Lab04 {
public static void firstTask(){
    for (int i = 1; i < 100; i++ ){
        System.out.println(i);
    }
}
public static void secondTask() {
    System.out.print("Делиться на 3: ");
    for (int i = 1; i<=100; i++){
        if ((i % 3) == 0)
            System.out.print(i + ", ");
    }
    System.out.println("");
    System.out.print("Делиться на 5: ");
    for (int i = 1; i<=100; i++){
        if ((i % 5) == 0)
            System.out.print(i + ", ");
    }
    System.out.println("");
    System.out.print("Делиться на 3 и на 5: ");
    for (int i = 1; i<=100; i++){
        if ((i % 3) == 0 || (i% 5) == 0)
            System.out.print(i + ", ");
    }
    System.out.println("");
}
public static void thirdTask(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
    int firstNumber = scanner.nextInt();
    System.out.println("Введите второе число");
    int secondNumber = scanner.nextInt();
    System.out.println("Введите третье число");
    int thirdNumber = scanner.nextInt();
    boolean result = firstNumber + secondNumber == thirdNumber;
    System.out.println("Результат: " + result);
}
public static void fourthTask() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
    int firstNumber = scanner.nextInt();
    System.out.println("Введите второе число");
    int secondNumber = scanner.nextInt();
    System.out.println("Введите третье число");
    int thirdNumber = scanner.nextInt();
    boolean result = firstNumber < secondNumber && secondNumber < thirdNumber;
    System.out.println("Результат: " + result);
}
public static boolean fifthTask(int [] array){
    boolean result = false;
    System.out.println("массив: " + Arrays.toString(array));
    if (array[0] == 3 || array[array.length-1] == 3) {
        result = true;
    }
    System.out.println(result);
    return result;
}
public static boolean sixthTask(int [] array) {
    boolean result = false;
    int countThree = 0;
    for (int i = 0; i < array.length; i++){
        if (array[i] == 1 || array[i] == 3){
            countThree += 1;
        }
    }
    if (countThree>0){
        result = true;
    }
    System.out.println("массив: " + Arrays.toString(array));
    System.out.println(result);
    return result;
}
public static void isArraySorted(int [] array){
    boolean isSorted = true;
    for (int i = 1; i < array.length; i ++){
        if (array[i] < array[i - 1]) {
            isSorted = false;
            break;
        }
    }
    if (isSorted){
        System.out.println("Ok");
    }
    else {
        System.out.println("Please, try again");
    }
}
public static void enterArray(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Введите длинну массива: ");
    int arrLength = scanner.nextInt();
    int[] array = new int[arrLength];
    for (int i = 1; i<=arrLength; i++){
        array[i-1] = scanner.nextInt();
    }
    System.out.println("Массив: [" + Arrays.toString(array) + "]");
}
public static void changeArrayElements(int[] array){
    int length = array.length;
    int[] reworkedArray = new int[length];
    for (int i = 0; i<length; i++){
        reworkedArray[i] = array[i];
    }
    reworkedArray[length-1] = array[0];
    reworkedArray[0] = array[length-1];
    System.out.println("Исходный массив: " + Arrays.toString(array));
    System.out.println("Обработанный массив " + Arrays.toString(reworkedArray));
}
    public static void firstUnique(int [] array) {
        Set<Integer> input = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int x : array) {
            if (!input.add(x)) {
                duplicates.add(x);
            }
        }
        input.removeAll(duplicates);
        if (input.isEmpty()){
            System.out.println("Уникальные элементы отсутствуют");
        }
        else{
            System.out.println("Первый уникальный элемент в массиве: " + input.iterator().next());
        }
    }
    public static int[] arraySort(int [] array) {
    int length = array.length;
    if (length<2){
        return array;
    }
    int middle = length/2;
    int[] firstPart = new int [middle];
    int[] secondPart = new int [length-middle];
    for (int i = 0; i<middle; i++){
        firstPart[i] = array[i];
    }
    for (int i = middle; i<length;i++){
        secondPart[i-middle] = array[i];
    }
    arraySort(firstPart);
    arraySort(secondPart);
    merge (array, firstPart, secondPart);
    return array;
    }
    private static void merge (int [] array, int [] left, int [] right){
    int leftSize = left.length;
    int rightSize = right.length;
    int i =0;
    int j =0;
    int k =0;
    while (i < leftSize && j < rightSize){
        if(left[i] <= right[j]){
            array[k] = left[i];
            i++;
        }
        else{
            array[k] = right[j];
            j++;
        }
        k++;
    }
    while (i<leftSize){
        array[k]=left[i];
        i++;
        k++;
    }
    while (j<rightSize){
        array[k] = right[j];
        j++;
        k++;
    }
    }
}
