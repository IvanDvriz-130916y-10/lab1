package ЛР7.Example5;

class SubClass2 extends SuperClass {
    protected char symbol;

    SubClass2(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void display() {
        System.out.println("Класс: " + getClass().getSimpleName());
        System.out.println("Значение поля text: " + text);
        System.out.println("Значение поля symbol: " + symbol);
    }
}

