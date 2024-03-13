package ЛР11;

//	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//        содержащий только те строки, которые содержат только буквы (без цифр и символов).
import java.util.ArrayList;
import java.util.List;
public class Example9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ford911");
        strings.add("phone");
        strings.add("water@");

        List<String> filteredStrings = filterAlphabeticStrings(strings);

        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
    public static List<String> filterAlphabeticStrings(List<String> strings) {
        List<String> filteredS = new ArrayList<>();

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                filteredS.add(str);
            }
        }
        return filteredS;
    }
}