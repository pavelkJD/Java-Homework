package test1;

/**
 * Created by KPS on 10.03.2015.
 */
public class TestingPrinter {
    public static void main(String[] args) {
       /* Printer myPrinter = new Printer();
        myPrinter.isOn = false;
        myPrinter.modelNumber = "CANON";

        Printer yourPrinter = new Printer();
        yourPrinter.isOn = true;
        yourPrinter.modelNumber = "HP";

        String theModelNumber = myPrinter.getModelNumber();
        System.out.println(theModelNumber);*/

        /*Использование конструктора для инициализации объектов класса Printer*/
        Printer myPrinter = new Printer(true, "XEROX");
        myPrinter.print();

        Printer yourPrinter = new Printer(false, "CANON");
        yourPrinter.print();
    }
}
