package ЛР7.Example3;
    class SuperClass {
        public int intValue;

        // Метод для присваивания значения полю
        public void setValue(int value) {
            this.intValue = value;
        }

        // Конструктор с одним параметром
        public SuperClass(int value) {
            this.intValue = value;
        }

        // Метод toString() для вывода информации о классе
        @Override
        public String toString() {
            return " SuperClass: intValue = " + intValue;
        }
    }

