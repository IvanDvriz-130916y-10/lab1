package ��7.Example3;
    class SuperClass {
        public int intValue;

        // ����� ��� ������������ �������� ����
        public void setValue(int value) {
            this.intValue = value;
        }

        // ����������� � ����� ����������
        public SuperClass(int value) {
            this.intValue = value;
        }

        // ����� toString() ��� ������ ���������� � ������
        @Override
        public String toString() {
            return " SuperClass: intValue = " + intValue;
        }
    }

