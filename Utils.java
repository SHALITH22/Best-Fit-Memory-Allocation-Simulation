import java.util.List;

public class Utils {

    // Method to display the current state of memory blocks
    public static void printMemoryState(List<MemoryBlock> memoryBlocks) {
        System.out.println("\nMemory Block Status:");
        for (int i = 0; i < memoryBlocks.size(); i++) {
            System.out.println("Block " + (i + 1) + ": " + memoryBlocks.get(i));
        }
    }
}
