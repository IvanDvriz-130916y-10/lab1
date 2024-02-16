package ЛР7.Example3;

// Создаем второй подкласс наследующийся от первого подкласса
class SubClass2 extends SubClass1 {
    public String stringValue;

    // Метод для присваивания значений полям (перегрузка метода из суперкласса)
    public void setValue(int intValue, char charValue, String stringValue) {
        this.intValue = intValue;
        this.charValue = charValue;
        this.stringValue = stringValue;
    }

    // Конструктор с тремя параметрами
    public SubClass2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);  // Вызов конструктора подкласса SubClass1
        this.stringValue = stringValue;
    }

    // Метод toString() для вывода информации о классе
    @Override
    public String toString() {
        return " SubClass2: intValue = " + intValue + ", charValue = " + charValue + ", stringValue = " + stringValue;
    }
}