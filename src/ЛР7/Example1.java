package ��7;

public class Example1 {

    // ����� SuperClassTest
    public static class SuperClassTest {
        // �������� ��������� ����
        private String str1;

        // ����������� � ��������� ����������
        public SuperClassTest(String strEx) {
            this.str1 = strEx;
        }

        // ����������� ��� ����������
        public SuperClassTest() {
        }

        @Override
        public String toString() {
            String superClassNameAndFieldValue;
            superClassNameAndFieldValue = "super" + "\n" +
                    "Class name: " + this.getClass().getSimpleName() + "\n" +
                    "str1 = " + this.getStr1();

            return superClassNameAndFieldValue;
        }

        public String getStr1() {
            return str1;
        }

        public void setStr1(String str1) {
            this.str1 = str1;
        }
    }

    // ����� SubClassTest
    public static class ubClassTest extends SuperClassTest {
        private String str2;
        private String str3;

        // ����������� � ����� ��������� ����������
        public SubClassTest(String strEx) {
            super(strEx);
        }

        // ����������� � ����� ���������� �����������
        public SubClassTest(String strEx2, String strEx3) {
            this.str2 = strEx2;
            this.str3 = strEx3;
        }

        @Override
        public String toString() {
            String classNameAndFieldValue;
            classNameAndFieldValue = "sub" + "\n" +
                    "Class name: " + this.getClass().getSimpleName() + "\n" +
                    "str1 = " + this.getStr1() + "\n" +
                    "str2 = " + this.str2 + "\n" +
                    "str3 = " + this.str3;
            return classNameAndFieldValue;
        }

        public String getStr3() {
            return str3;
        }

        public void setStr3(String str3) {
            this.str3 = str3;
        }

        public String getStr2() {
            return str2;
        }

        public void setStr2(String str2) {
            this.str2 = str2;
        }
    }

    // ����� Main
    public static class Main {
        public static void main(String[] args) {
            // �������� ������� ������ SuperClassTest
            SuperClassTest superClassObject = new SuperClassTest("������� � ����������� �����������");
            String className = superClassObject.toString();
            System.out.println(className);

            // �������� ������� ������ SubClassTest � ����� ��������� ����������
            SubClassTest subClassObject1 = new SubClassTest("������� � ����������� ���������");
            String subClassName = subClassObject1.toString();
            System.out.println(subClassName);

            // �������� ������� ������ SubClassTest � ����� ���������� �����������
            SubClassTest subClassObject2 = new SubClassTest("������� � ����������� ���������", "��� ��� ���������");
            String subClassName2 = subClassObject2.toString();
            System.out.println(subClassName2);
        }
    }
}
