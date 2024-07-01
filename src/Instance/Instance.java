package Instance;

public class Instance {
    private final int nbItems;
    private final int capacity;
    private final int[] itemValues;
    private final int[] itemWeights;

    public Instance(int nbItems, int capacity, int[] itemValues, int[] itemWeights) {
        this.nbItems = nbItems;
        this.capacity = capacity;
        this.itemValues = itemValues;
        this.itemWeights = itemWeights;
    }
    public int getNbItems(){
        return nbItems;
    }
}
