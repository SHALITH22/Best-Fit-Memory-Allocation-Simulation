import java.util.List;

public class BestFitAlgorithm {

    // Method to find the best fit for a process
    public static void bestFitAllocate(List<MemoryBlock> memoryBlocks, List<Integer> processSizes) {
        for (int process : processSizes) {
            int bestIndex = -1;
            int minDifference = Integer.MAX_VALUE;

            // Loop through memory blocks to find the best fit
            for (int i = 0; i < memoryBlocks.size(); i++) {
                MemoryBlock block = memoryBlocks.get(i);
                if (!block.isAllocated() && block.getSize() >= process) {
                    int difference = block.getSize() - process;
                    if (difference < minDifference) {
                        minDifference = difference;
                        bestIndex = i;
                    }
                }
            }

            // If a suitable block is found, allocate the process
            if (bestIndex != -1) {
                MemoryBlock block = memoryBlocks.get(bestIndex);
                block.allocate();
                block.setSize(block.getSize() - process);  // Adjust block size after allocation
                System.out.println("Process of size " + process + " allocated to Block " + (bestIndex + 1));
            } else {
                System.out.println("Process of size " + process + " could not be allocated.");
            }
        }
    }
}
