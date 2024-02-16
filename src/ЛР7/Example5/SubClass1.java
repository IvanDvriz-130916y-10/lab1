package ЛР7.Example5;

    class SubClass1 extends SuperClass {
        protected int number;

        SubClass1(String text, int number) {
            super(text);
            this.number = number;
        }

        @Override
        public void display() {
            System.out.println("Класс: " + getClass().getSimpleName());
            System.out.println("Значение поля text: " + text);
            System.out.println("Значение поля number: " + number);
        }
    }

