import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }

        System.out.println(result.toString());
    }
}