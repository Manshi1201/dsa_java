import java.util.Scanner;

public class containerwater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights:");
        for(int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int maxWater = 0;

        while(left < right) {

            int h = Math.min(height[left], height[right]);
            int width = right - left;

            int area = h * width;

            if(area > maxWater) {
                maxWater = area;
            }

            // move smaller height
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum water = " + maxWater);
    }
}
