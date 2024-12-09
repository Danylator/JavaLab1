import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Номер залiкової книжки: ");
        int insertedNum = scanner.nextInt();

        int[] divisors = {5, 7, 11};
        int[] remainders = new int[divisors.length];

  
        for (int i = 0; i < divisors.length; i++) {
            remainders[i] = insertedNum % divisors[i];
        }

        System.out.println("Результаты:");
        for (int i = 0; i < divisors.length; i++) {
            System.out.println("C" + divisors[i] + " (остаток вiд дiлення на " + divisors[i] + "): " + remainders[i]);
        }

        scanner.close();
    }
}