package ЛР5;
public class Example2 {
    public char charX;
    public char charY;
    public static void main(String[] args) {
         Example2 example2 = new Example2();
        System.out.println("");
        example2.setCh('A','D');
        example2.result();
    }
    public void result() {
        int a = charX;
        int b = charY;
        if (charX > charY) {
            a = charY;
            b = charX;
        }
        int i = a;
        int q = 1;
        for (i = a; i <=b; i++){
            System.out.println("Символ: " + (char)i);
            q ++;
        }
    }
    public void setCh (char charAA, char charBB) {
        this.charX = charAA;
        this.charY = charBB;
    }
 }

