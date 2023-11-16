package Ћ–1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите мес€ц: ");
        String month = in.nextLine();

        System.out.println("¬ведите сколько дней в мес€це: ");
        int quantity = in.nextInt();

        System.out.println(month + " содержит " + quantity + " дней\n");
        in.close();
    }
}