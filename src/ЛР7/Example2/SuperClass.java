package ЛР7.Example2;

class SuperClass {
    private String text; // приватное текстовое поле

    // Конструктор для создания объекта на основе текстового аргумента
    public SuperClass(String text) {
        this.text = text;
    }

    // Метод без параметров для присваивания значения полю
    public void setText() {
        this.text = "Default Text";
    }

    // Метод с одним текстовым параметром для присваивания значения полю
    public void setText(String text) {
        this.text = text;
    }

    // Свойство, возвращающее длину текстовой строки
    public int getLength() {
        return text.length();
    }
}