import java.util.Scanner;

public class nextgreaterelement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            int nextGreater = -1;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }

            System.out.print(nextGreater + " ");
        }
    }
}
