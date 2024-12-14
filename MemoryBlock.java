public class MemoryBlock {
    private int size;
    private boolean isAllocated;
    
    // Constructor
    public MemoryBlock(int size) {
        this.size = size;
        this.isAllocated = false;
    }

    // Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAllocated() {
        return isAllocated;
    }

    public void allocate() {
        this.isAllocated = true;
    }

    public void deallocate() {
        this.isAllocated = false;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Allocated: " + isAllocated;
    }
}
