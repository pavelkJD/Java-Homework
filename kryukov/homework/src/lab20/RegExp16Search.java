package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу выполняющую поиск в строке шеснадцатеричных чисел, записанных по правилам Java, с помощью регулярных
выражений и вывести их на страницу.
 */
public class RegExp16Search {
    public static void main(String[] args) {
        String str = "Test FFF string 2b for CC split.";
        Pattern pat = Pattern.compile(" ([0-9]*[A-Fa-f]*) *");
        Matcher matcher = pat.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
