package ЛР6;

public class Example7 {
     public static void main(String[] args) {
          char[] charArray = {'a', 'b', 'c', 'd', 'e'};
          int[] intArray = getCharCodes(charArray);
          for (int i = 0; i < intArray.length; i++) {
               System.out.println("Символ: " + charArray[i] + "\n" + " Код символа : " + intArray[i]);
          }
     }

     public static int[] getCharCodes(char[] charArray) {
          int[] intArray = new int[charArray.length];
          for (int i = 0; i < charArray.length; i++) {
               intArray[i] = (int) charArray[i];
          }
          return intArray;
     }
}

