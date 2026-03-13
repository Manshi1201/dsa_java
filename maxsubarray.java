import java.util.Scanner;

public class maxsubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < n; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
