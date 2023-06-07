import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class InstructionsGenerator {
    public static List<String> generateInstructions(int gridSize, List<Coordinate> coordinates) {
        List<String> instructions = new ArrayList<>();

        coordinates.sort(Comparator.comparingInt(c -> c.getX() != c.getX() ? c.getX() : c.getY()));

        int currentX = 0;
        int currentY = 0;

        for (Coordinate coordinate : coordinates) {
            int targetX = coordinate.getX();
            int targetY = coordinate.getY();

            generateHorizontalInstructions(instructions, currentX, targetX);
            generateVerticalInstructions(instructions, currentY, targetY);

            instructions.add("C");

            currentX = targetX;
            currentY = targetY;
        }

        return instructions;
    }

    private static void generateHorizontalInstructions(List<String> instructions, int currentX, int targetX) {
        generateMoveInstructions(instructions, currentX, targetX, "E", "W");
    }

    private static void generateVerticalInstructions(List<String> instructions, int currentY, int targetY) {
        generateMoveInstructions(instructions, currentY, targetY, "N", "S");
    }

    private static void generateMoveInstructions(List<String> instructions, int current, int target, String positive,
                                                 String negative) {
        for (int i = 0; i < Math.abs(target - current); i++) {
            if (target < current) {
                instructions.add(negative);
            } else if (target > current) {
                instructions.add(positive);
            }
        }
    }
}