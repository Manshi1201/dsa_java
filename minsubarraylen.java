import java.util.Scanner;

public class minsubarraylen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < n; right++) {

            sum += arr[right];

            while(sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println("Minimum length = " + minLen);
        }
    }
}
