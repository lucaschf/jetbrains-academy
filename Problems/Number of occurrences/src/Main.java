import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String sequence = scanner.nextLine();

        int count = 0;

        while (str.contains(sequence)) {
            count++;
            str = str.replaceFirst(sequence, "");
        }

        System.out.println(count);
    }
}