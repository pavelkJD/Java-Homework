package lab4;

/**
 * Created by KPS on 21.02.2015.
 */
public class RectCirc {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int r = 6;
        if ((a * a + b * b) <= (r * 2) * (r * 2)) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя закрыть");
        }
    }
}
