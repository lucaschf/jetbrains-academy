import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            String s = "";

            if (i % 3 == 0) {
                s += "Fizz";
            }

            if (i % 5 == 0) {
                s += "Buzz";
            }

            System.out.println(s.isEmpty() ? i : s);
        }
    }
}
