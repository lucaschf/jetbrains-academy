import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";

        var input = new Scanner(System.in).nextLine();

        System.out.println(input.isEmpty() || alphabet.contains(input.toLowerCase()));
    }
}