package ��7.Example4;

class BaseClass {
    protected char symbol; // ���������� ����

    // ����������� ��� �������� ������� �� ������ �������� ����
    BaseClass(char symbol) {
        this.symbol = symbol;
    }

    // ����������� �������� ����� �������
    BaseClass(BaseClass original) {
        this.symbol = original.symbol;
    }
}