package HomeWork4.Sorter;

public class SortAlgorithmHandler {
    public ISorter getStrategy(SortType algorithmType) throws IllegalArgumentException {
        switch (algorithmType) {
            case BUBBLE -> {
                return new BubbleSort();
            }
            case MERGE -> {
                return new MergeSort();
            }
            case QUICK -> {
                return new QuickSort();
            }
            default -> throw new IllegalArgumentException("Unknown sorting algorithm");
        }
    }
}
