package lab30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Создать файл с текстом, прочитать, подсчитать количество знаков припинания и слов.
 */

public class QtyOfWordsAndPunctsInFile {

    public static void main(String[] args) throws IOException {
        BufferedReader fileInputStream = new BufferedReader(new FileReader("text.txt"));
        String res = fileInputStream.readLine();
        StringBuffer strBuffer = new StringBuffer(res);
        while (res != null) {
            System.out.println(res);
            res = fileInputStream.readLine();
        }
        fileInputStream.close();

        String text = strBuffer.toString();
        String[] words = text.trim().replace(".", "").replace(",", "").split(" +");
        System.out.print("В тексте " + words.length + " слов(а)");

        int numCommas = 0;
        int numDashes = 0;
        int numDots = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == ',') {
                numCommas++;
            } else if (symbol == '-') {
                numDashes++;
            } else if (symbol == '.') {
                numDots++;
            }
        }
        System.out.println(", а также: " + numCommas + " запятая(ых), " + numDashes + " тире" + ", " + numDots + " точек(ки).");
    }
}
