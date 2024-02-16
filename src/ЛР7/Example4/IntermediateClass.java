package ЛР7.Example4;

class IntermediateClass extends BaseClass {
    protected String text; // текстовое поле

    // Конструктор для создания объекта на основе значений полей
    IntermediateClass(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    // Конструктор создания копии объекта
    IntermediateClass(IntermediateClass original) {
        super(original);
        this.text = original.text;
    }
}