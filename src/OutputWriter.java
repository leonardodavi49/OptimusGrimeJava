import java.util.List;

class OutputWriter {
    public static void printInstructions(List<String> instructions) {
        System.out.print("Instructions: ");
        for (String instruction : instructions) {
            System.out.print(instruction);
        }
    }
}