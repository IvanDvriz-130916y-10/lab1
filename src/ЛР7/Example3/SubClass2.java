package ��7.Example3;

// ������� ������ �������� ������������� �� ������� ���������
class SubClass2 extends SubClass1 {
    public String stringValue;

    // ����� ��� ������������ �������� ����� (���������� ������ �� �����������)
    public void setValue(int intValue, char charValue, String stringValue) {
        this.intValue = intValue;
        this.charValue = charValue;
        this.stringValue = stringValue;
    }

    // ����������� � ����� �����������
    public SubClass2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);  // ����� ������������ ��������� SubClass1
        this.stringValue = stringValue;
    }

    // ����� toString() ��� ������ ���������� � ������
    @Override
    public String toString() {
        return " SubClass2: intValue = " + intValue + ", charValue = " + charValue + ", stringValue = " + stringValue;
    }
}