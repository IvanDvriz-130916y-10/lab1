package ��11;

//	�������� �������, ������� ��������� �� ���� ������ ����� � ���������� ����� ������,
//        ���������� ������ �� ������, ������� ����� ����� ������ ��������� ��������.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ��������: ");
        int minLength = in.nextInt();

        List<String> strings = new ArrayList<>();
        strings.add("api");
        strings.add("room");
        strings.add("bread");
        strings.add("static");
        strings.add("c");

        List<String> filteredS = filterStringsByLength(strings, minLength);

        for (String str : filteredS) {
            System.out.println(str);
        }
    }
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > minLength) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}