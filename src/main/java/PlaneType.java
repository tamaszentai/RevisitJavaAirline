public enum PlaneType {
    LARGEPLANE(300, 20),
    MEDIUMPLANE(200, 15),
    SMALLPLANE(100, 10);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
