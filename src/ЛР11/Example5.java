package ЛР11;

//        Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//        содержащий только те строки, которые содержат заданную подстроку.
import java.util.ArrayList;
import java.util.List;
public class Example5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("word");
        strings.add("program");
        strings.add("project");
        strings.add("example");

        List<String> filteredStrings = filterStringsContainingSubstring(strings, "o");

        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
    public static List<String> filterStringsContainingSubstring(List<String> strings, String subString) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(subString)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
}