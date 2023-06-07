import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gridSize = InputReader.readIntFromUser(scanner, "Enter the grid size: ");
        int numCoordinates = InputReader.readIntFromUser(scanner, "Enter the number of coordinates: ");

        List<Coordinate> coordinates = new ArrayList<>();
        for (int i = 0; i < numCoordinates; i++) {
            int x = InputReader.readIntFromUser(scanner, "Enter coordinate " + (i + 1) + " (x): ");
            int y = InputReader.readIntFromUser(scanner, "Enter coordinate " + (i + 1) + " (y): ");
            coordinates.add(new Coordinate(x, y));
        }

        List<String> instructions = InstructionsGenerator.generateInstructions(gridSize, coordinates);

        OutputWriter.printInstructions(instructions);
    }
}
