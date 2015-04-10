package lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметр <p id="p1">,
и замену их на простые теги абзацев <p>.
 */
public class TegFinder {
    public static void main(String[] args) {
        String text = "<p> поиск </p> <p id='p1'> текст </p>";

        Pattern pattern = Pattern.compile("(</?p +\\S*>)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.replace(matcher.group(), "<p>"));

        }
    }
}
