import java.util.Scanner;

public class PrimeNumber {

    
    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        else {
            int count = 0;
            // for (int i = 2; i <= num / 2; i++) {
            // if (num % i == 0)
            // return false;
            // }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter Any Number :");
        int number = scn.nextInt();
        int i = 0;
        System.out.println("Given Number is prime or not : "
                + (isPrime(number) ? "Yes, " + number + " is prime." : "No, " + number + " is not Prime."));
        System.out.println();
        System.out.println("Prime numbers upto " + number + " : ");
        while (i <= number) {
            if (isPrime(i)) {
                System.out.print("\t" + i);
            }
            i++;
        }
        System.out.println();
        ;
    }
}