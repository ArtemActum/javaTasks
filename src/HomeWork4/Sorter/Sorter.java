package HomeWork4.Sorter;

public class Sorter {
    private final SortAlgorithmHandler handler = new SortAlgorithmHandler();

    public void sort(int[] array, SortType algorithmType) {
        ISorter strategy = handler.getStrategy(algorithmType);
        strategy.sort(array);
    }
}
