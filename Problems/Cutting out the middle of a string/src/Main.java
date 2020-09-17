import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final String input = new Scanner(System.in).next();

        int middle = input.length() / 2;
        String output;

        if (input.length() % 2 == 0) {
            output = input.substring(0, middle - 1) + input.substring(middle + 1);
        } else {
            output = input.substring(0, middle) + input.substring(middle + 1);
        }

        System.out.println(output);
    }
}