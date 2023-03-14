
/**
Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
 */

import java.util.Random;
import java.util.ArrayList;


public class Task1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(10));
        }

        System.out.println(arr);

        arr.removeIf(i -> i % 2 == 0);

        System.out.println(arr);
    }
}