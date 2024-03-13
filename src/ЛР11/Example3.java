package ЛР11;

//         Напишите функцию, которая принимает на вход список строк и
//        возвращает новый список, содержащий только те строки, которые
//        начинаются с большой буквы.

import java.util.ArrayList;
import java.util.List;

    public class Example3 {

        public static List<String> filterStrings(List<String> inputList) {
            List<String> resultList = new ArrayList<>();

            for (String str : inputList) {
                if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                    resultList.add(str);
                }
            }

            return resultList;
        }

        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("Dvornikov");
            inputList.add("mouse");
            inputList.add("ping");
            inputList.add("Ivan");
            inputList.add("Sergeevich");
            inputList.add("java");
            inputList.add("project");

            List<String> filteredList = filterStrings(inputList);

            System.out.println("Cписок: " + inputList);
            System.out.println("Cписок после применения фильтра: " + filteredList);
        }
    }


