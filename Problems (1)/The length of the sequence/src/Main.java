import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int length = 0;
        Scanner scan = new Scanner(System.in);

        while (scan.nextInt() != 0) {
            length++;
        }

        System.out.println(length);
    }
}