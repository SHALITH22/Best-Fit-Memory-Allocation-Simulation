import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        // Initialize memory blocks
        List<MemoryBlock> memoryBlocks = new ArrayList<>();
        memoryBlocks.add(new MemoryBlock(100));
        memoryBlocks.add(new MemoryBlock(500));
        memoryBlocks.add(new MemoryBlock(200));
        memoryBlocks.add(new MemoryBlock(300));
        memoryBlocks.add(new MemoryBlock(600));

        // Initialize process requests
        List<Integer> processRequests = new ArrayList<>();
        processRequests.add(212);
        processRequests.add(417);
        processRequests.add(112);
        processRequests.add(426);

        // Display initial memory status
        Utils.printMemoryState(memoryBlocks);

        // Perform the Best Fit allocation
        BestFitAlgorithm.bestFitAllocate(memoryBlocks, processRequests);

        // Display final memory status
        Utils.printMemoryState(memoryBlocks);
    }
}
