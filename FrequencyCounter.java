import java.util.Scanner;

public class FrequencyCounter {

        public static void frequiency(int[] arr) {
            int n = arr.length;
            boolean[] visited = new boolean[n];
    
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    continue;
                }
    
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
    
                System.out.println("Element: " + arr[i] + ", Frequency: " + count);
            }
        }
    
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted way:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
      
            frequiency(arr);
        }
    }
    