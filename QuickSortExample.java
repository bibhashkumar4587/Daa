import java.util.Random;

public class QuickSortExample {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static long measureTime(int[] array) {
        long startTime = System.nanoTime();
        quickSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

  
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000, 10000, 50000, 100000};
        Random rand = new Random();

        for (int n : sizes) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = rand.nextInt(10000); 
            }
            long timeTaken = measureTime(array);
            System.out.println("Time taken to sort " + n + " elements: " + timeTaken / 1e6 + " ms");
        }
    }
}
