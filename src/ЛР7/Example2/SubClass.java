package ЛР7.Example2;

class SubClass extends SuperClass {
    private int number; // открытое целочисленное поле

    // Конструктор для создания объекта на основе целочисленного и текстового параметров
    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    // Переопределение метода без параметров из суперкласса
    public void setText() {
        super.setText();
        this.number = 0;
    }

    // Перегрузка метода с текстовым параметром из суперкласса
    public void setText(String text) {
        super.setText(text);
        this.number = 0;
    }

    // Перегрузка метода с целочисленным параметром
    public void setText(int number) {
        super.setText();
        this.number = number;
    }

    // Перегрузка метода с текстовым и целочисленным параметрами
    public void setText(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}