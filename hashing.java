import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashing {
        public static  HashMap<Integer, Integer> frequenyCount(int arr[])
        {
                HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
                for(int i=0;i<arr.length;i++)
                {
                        if(map.containsKey(arr[i]))
                        {
                                map.put(arr[i],map.get(arr[i])+1);
                        }
                        else{
                                map.put(arr[i],1);
                        }
                }
                return map;

        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Element frequencies:");
        HashMap<Integer,Integer> map=frequenyCount(arr);
     for(Map.Entry entry:map.entrySet())
     {
        System.out.println("Element "+entry.getKey()+"  Frequency "+entry.getValue());
     }
    }
}

