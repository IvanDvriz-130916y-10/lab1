package ЛР7.Example1;

public class SuperClassTest {
    // Закрытое текстовое поле
    private String str1;

    // Конструктор с текстовым аргументом
    public SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    // Конструктор без аргументов
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