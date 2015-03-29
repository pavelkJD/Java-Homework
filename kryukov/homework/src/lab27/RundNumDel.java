package lab27;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */

import java.util.*;

public class RundNumDel {
    public static void main(String[] args) {

        List<Integer> randNumList = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randNumList.add(rand.nextInt(20));
        }
        System.out.println(randNumList);

        Set<Integer> set = new HashSet<Integer>(randNumList);
        randNumList.clear();
        randNumList.addAll(set);

        System.out.println(randNumList);
    }
}
