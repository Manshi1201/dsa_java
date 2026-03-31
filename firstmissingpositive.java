import java.util.Scanner;

public class firstmissingpositive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Place elements at correct positions
        for(int i = 0; i < n; i++) {
            while(arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Find missing positive
        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                System.out.println("Missing number = " + (i + 1));
                return;
            }
        }

        System.out.println("Missing number = " + (n + 1));
    }
}
