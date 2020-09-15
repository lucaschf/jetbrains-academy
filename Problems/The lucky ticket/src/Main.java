import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var ticket = new Scanner(System.in).next();

        var leftSum = 0;
        var rightSum = 0;

        for (int i = 0; i < ticket.length() / 2; i++) {
            leftSum += Integer.parseInt(String.valueOf(ticket.charAt(i)));
        }

        for (int i = ticket.length() / 2; i < ticket.length(); i++) {
            rightSum += Integer.parseInt(String.valueOf(ticket.charAt(i)));
        }

        System.out.println(rightSum == leftSum ? "Lucky" : "Regular");
    }
}