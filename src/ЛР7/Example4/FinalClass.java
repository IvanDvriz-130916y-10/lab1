package ЛР7.Example4;

class FinalClass extends IntermediateClass {
    protected int number; // целочисленное поле

    // Конструктор для создания объекта на основе значений полей
    FinalClass(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    // Конструктор создания копии объекта
    FinalClass(FinalClass original) {
        super(original);
        this.number = original.number;
    }
}