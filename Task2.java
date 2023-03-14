
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arr.add(rnd.nextInt(10));
        }
        System.out.println(arr);
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        double sum = (arr.stream().mapToInt(Integer::intValue).sum());
        double average = sum / arr.size();
        System.out.println(average);

    }
}