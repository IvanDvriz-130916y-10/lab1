package ��7.Example3;

    // ������� �������� ������������� �� �����������
    class SubClass1 extends SuperClass {
        public char charValue;

        // ����� ��� ������������ �������� ����� (���������� ������ �� �����������)
        public void setValue(int intValue, char charValue) {
            this.intValue = intValue;
            this.charValue = charValue;
        }

        // ����������� � ����� �����������
        public SubClass1(int intValue, char charValue) {
            super(intValue);  // ����� ������������ �����������
            this.charValue = charValue;
        }

        // ����� toString() ��� ������ ���������� � ������
        @Override
        public String toString() {
            return " SubClass1: intValue = " + intValue + ", charValue = " + charValue;
        }
    }
