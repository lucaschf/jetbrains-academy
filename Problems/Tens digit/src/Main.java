import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var read = scanner.nextInt();

        while (read >= 100) {
            read = read % 100;
        }

        if (read < 10) {
            System.out.println(0);
            return;
        }

        while (read >= 10) {
            read = read / 10;
        }

        System.out.println(read);
    }
}
