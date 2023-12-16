package ËÐ4;
public class Example1 {
    public static void main(String[] args) {
        Rectange(23,11,'*');
    }
    private static void Rectange(int width,int height,char m) {
        Horizontal(width,m);
        for(int i=0;i<height-2;i++) {
            Vertical(width,m);
        }
        Horizontal(width,m);
    }
    private static void Vertical(int width, char x) {
        System.out.print(x);
        for (int j = 0; j < width-2; j++) {
            System.out.print(" ");
        }
        System.out.println(x);
    }
    private static void Horizontal(int width,char a) {
        for (int k = 0; k < width-1; k++) {
            System.out.print(a);
        }
        System.out.println(a);
    }
}
