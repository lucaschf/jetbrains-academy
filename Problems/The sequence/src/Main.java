import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maximumDivisible = 0;
        int input;
        int sequenceSize = scan.nextInt();

        int i = 0;

        while (i < sequenceSize) {
            input = scan.nextInt();

            if (input % 4 == 0 && input > maximumDivisible) {
                maximumDivisible = input;
            }

            i++;
        }

        System.out.println(maximumDivisible);
    }
}
