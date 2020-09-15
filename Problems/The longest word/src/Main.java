import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in).nextLine();

        String longest = "";

        for (String s : input.split(" ")) {
            if (longest.length() < s.length()) {
                longest = s;
            }
        }

        System.out.println(longest);
    }
}