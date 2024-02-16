package ЛР7.Example3;

    // Создаем подкласс наследующийся от суперкласса
    class SubClass1 extends SuperClass {
        public char charValue;

        // Метод для присваивания значений полям (перегрузка метода из суперкласса)
        public void setValue(int intValue, char charValue) {
            this.intValue = intValue;
            this.charValue = charValue;
        }

        // Конструктор с двумя параметрами
        public SubClass1(int intValue, char charValue) {
            super(intValue);  // Вызов конструктора суперкласса
            this.charValue = charValue;
        }

        // Метод toString() для вывода информации о классе
        @Override
        public String toString() {
            return " SubClass1: intValue = " + intValue + ", charValue = " + charValue;
        }
    }
