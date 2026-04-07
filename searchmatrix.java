import java.util.Scanner;

public class searchmatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter cols: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix:");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int left = 0;
        int right = m * n - 1;

        boolean found = false;

        while(left <= right) {

            int mid = (left + right) / 2;

            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target) {
                found = true;
                break;
            }
            else if(matrix[row][col] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        if(found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
