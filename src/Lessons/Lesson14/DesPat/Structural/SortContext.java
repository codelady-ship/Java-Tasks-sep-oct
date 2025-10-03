package Lessons.Lesson14.DesPat.Structural;

public class SortContext {
    private final Sortable bublesort = new BubleSort();
    private final Sortable quicksort = new QuickSort();

    public String sort (int[] numbers){
        if (numbers.length<100){
            return quicksort.sort(numbers);
        }
        return bublesort.sort(numbers);
    }
}

