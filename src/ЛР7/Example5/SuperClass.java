package ЛР7.Example5;

    public class SuperClass {

        protected String text;

        SuperClass(String text) {
            this.text = text;
        }

        public void display() {
            System.out.println("Класс: " + getClass().getSimpleName());
            System.out.println("Значение поля: " + text);
        }
    }

