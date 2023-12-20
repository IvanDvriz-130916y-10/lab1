package ËÐ6;

public class Example1 {
    public static void main(String[] args) {
        myMain1 example1 = new myMain1();

        example1.getCharsStr('X');
        example1.getCharsStr("Hello");

        System.out.println(example1.chars);
        System.out.println(example1.str);

        char [] chars11 = new char[3];
        chars11[0] = 'B';
        chars11[1] = 'y';
        chars11[2] = 'e';
        example1.getCharsStr(chars11);
        System.out.println(example1.str);

        char[] chars22 = new char[1];
        chars22[0] = 'Y';
        example1.getCharsStr(chars22);
        System.out.println(example1.chars);
    }

    public static class myMain1 {
        String str;
        char chars;

        public void getCharsStr(char chars) {
            this.chars = chars;
        }
        public void getCharsStr(String str) {
            this.str = str;
        }
        public void getCharsStr(char [] chars11) {
            if (chars11.length == 1) {
                this.chars = chars11[0];
            } else  if (chars11.length > 1){
                this.str = String.valueOf(chars11);
            }
        }
    }
}
