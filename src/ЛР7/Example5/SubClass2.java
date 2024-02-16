package ��7.Example5;

class SubClass2 extends SuperClass {
    protected char symbol;

    SubClass2(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void display() {
        System.out.println("�����: " + getClass().getSimpleName());
        System.out.println("�������� ���� text: " + text);
        System.out.println("�������� ���� symbol: " + symbol);
    }
}

