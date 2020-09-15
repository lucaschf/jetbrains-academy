import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceSize = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < sequenceSize; i++) {
            int current = scanner.nextInt();

            if (current % 6 == 0) {
                sum += current;
            }
        }

        System.out.println(sum);
    }
}
