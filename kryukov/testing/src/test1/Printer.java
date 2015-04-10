package test1;

/**
 * Created by KPS on 10.03.2015.
 */
public class Printer {
    private boolean isOn;
    private String modelNumber;

    /*Конструктор с параметрами */
    public Printer(boolean isOn, String modelNumber) {
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    /* Метод класса*/
    public  void print(){
        System.out.println(isOn);
        System.out.println(modelNumber);
    }

    public void print(String text){
        System.out.println(text);
    }

    public String getModelNumber() {
        return modelNumber;
    }
}
