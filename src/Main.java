import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter, min = 1, max = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz : ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int number = input.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The biggest number: " + max);
        System.out.println("The smallest number:  " + min);
    }
}