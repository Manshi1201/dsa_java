import java.util.*;

public class pairsum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Pairs:");

        for(int i = 0; i < n; i++) {

            int complement = k - arr[i];

            if(map.containsKey(complement)) {
                System.out.println(arr[i] + " " + complement);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
    }
}
