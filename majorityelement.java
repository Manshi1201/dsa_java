import java.util.Scanner;

public class majorityelement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {

            if(count == 0) {
                candidate = arr[i];
            }

            if(arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority element = " + candidate);
    }
}
