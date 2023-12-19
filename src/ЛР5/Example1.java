package ЛР5;

public class Example1 {

        private char ch1;  // Закрытое символьное поле
        public void setCh1 ( char ch1){
            this.ch1 = ch1;
        }
        public int getCode () {  //преобразование типа
            return ch1;
        }
        public void showCodeAndValue () {
            System.out.println("Value: " + ch1);
            System.out.println("Code: " + (int) ch1);
        }

        public static class main {
            public static void main(String[] args) {
                Example1 task1 = new Example1();
                task1.setCh1('i');
                System.out.println("getCode: " + task1.getCode());
                task1.showCodeAndValue();
            }
        }
    }