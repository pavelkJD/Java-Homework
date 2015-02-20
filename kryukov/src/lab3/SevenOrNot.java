package lab3;

/**
 * Created by KPS on 20.02.2015.
 */
public class SevenOrNot {
    public static void main(String[] args) {
        int x = 21;
        if ((x - 7) % 10 == 0) {
            System.out.println("Число заканчивается на \"7\"");
        } else {
            System.out.println("Число НЕ заканчивается на \"7\"");
        }
    }
}