import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        boolean inInterval = input > -15 && input <= 12 || input > 14 && input < 17 || input >= 19;
        System.out.println(inInterval ? "True" : "False");
    }
}