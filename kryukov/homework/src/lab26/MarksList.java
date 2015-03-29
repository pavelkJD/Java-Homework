package lab26;

import java.util.ArrayList;
import java.util.List;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки
из списка.
 */

public class MarksList {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<Integer>();
        marksList.add(5);
        marksList.add(1);
        marksList.add(4);
        marksList.add(2);
        marksList.add(3);
        marksList.add(4);

        System.out.println(marksList);

        for (int i = 0; i < marksList.size(); i++) {
            if (marksList.get(i) < 3) {
                marksList.remove(i);
                i--;
            }
        }
        System.out.println(marksList);
    }
}
