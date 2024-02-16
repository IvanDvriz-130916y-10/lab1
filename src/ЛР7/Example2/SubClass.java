package ��7.Example2;

class SubClass extends SuperClass {
    private int number; // �������� ������������� ����

    // ����������� ��� �������� ������� �� ������ �������������� � ���������� ����������
    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    // ��������������� ������ ��� ���������� �� �����������
    public void setText() {
        super.setText();
        this.number = 0;
    }

    // ���������� ������ � ��������� ���������� �� �����������
    public void setText(String text) {
        super.setText(text);
        this.number = 0;
    }

    // ���������� ������ � ������������� ����������
    public void setText(int number) {
        super.setText();
        this.number = number;
    }

    // ���������� ������ � ��������� � ������������� �����������
    public void setText(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}