import java.util.Scanner;

public class productexceptself {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // Left product
        left[0] = 1;
        for(int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // Right product
        right[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        // Final result
        for(int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        System.out.println("Result array:");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
