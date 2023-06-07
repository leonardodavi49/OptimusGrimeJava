import java.util.Scanner;

class InputReader {
    public static int readIntFromUser(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}