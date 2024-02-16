package ��7.Example4;

class FinalClass extends IntermediateClass {
    protected int number; // ������������� ����

    // ����������� ��� �������� ������� �� ������ �������� �����
    FinalClass(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    // ����������� �������� ����� �������
    FinalClass(FinalClass original) {
        super(original);
        this.number = original.number;
    }
}