package lab28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку с помощью
итератора.
 */

public class TopMarkInArrayListByIterator {
    public static void main(String[] args) {

        List<Integer> markList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int rand = 2 + (int) (Math.random() * ((5 - 2) + 1));
            markList.add(rand);
        }
        System.out.println(markList);

        Iterator<Integer> iterator = markList.listIterator();
        Integer topMark = markList.get(0);
        while (iterator.hasNext()) {
            if (topMark < iterator.next()) {
                topMark = iterator.next();
            }
        }
        System.out.println("Максимальная оценка = " + topMark);
    }
}
