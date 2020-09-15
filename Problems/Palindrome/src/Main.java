import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String reversed = new StringBuilder(str)
                .reverse()
                .toString();

        System.out.println(reversed.equals(str) ? "yes" : "no");
    }
}
