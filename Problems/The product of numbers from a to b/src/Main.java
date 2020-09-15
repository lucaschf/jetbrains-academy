import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInclusive = scanner.nextInt();
        int endExclusive = scanner.nextInt();

        long result = startInclusive;
        for (int i = ++startInclusive; i < endExclusive; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}