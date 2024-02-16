package ��7.Example2;

class SuperClass {
    private String text; // ��������� ��������� ����

    // ����������� ��� �������� ������� �� ������ ���������� ���������
    public SuperClass(String text) {
        this.text = text;
    }

    // ����� ��� ���������� ��� ������������ �������� ����
    public void setText() {
        this.text = "Default Text";
    }

    // ����� � ����� ��������� ���������� ��� ������������ �������� ����
    public void setText(String text) {
        this.text = text;
    }

    // ��������, ������������ ����� ��������� ������
    public int getLength() {
        return text.length();
    }
}