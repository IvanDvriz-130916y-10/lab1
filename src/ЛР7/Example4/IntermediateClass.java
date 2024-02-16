package ��7.Example4;

class IntermediateClass extends BaseClass {
    protected String text; // ��������� ����

    // ����������� ��� �������� ������� �� ������ �������� �����
    IntermediateClass(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    // ����������� �������� ����� �������
    IntermediateClass(IntermediateClass original) {
        super(original);
        this.text = original.text;
    }
}