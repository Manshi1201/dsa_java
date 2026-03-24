import java.util.Scanner;

public class maxproductsubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for(int i = 1; i < n; i++) {

            int tempMax = Math.max(arr[i], Math.max(max * arr[i], min * arr[i]));
            int tempMin = Math.min(arr[i], Math.min(max * arr[i], min * arr[i]));

            max = tempMax;
            min = tempMin;

            result = Math.max(result, max);
        }

        System.out.println("Maximum product = " + result);
    }
}
