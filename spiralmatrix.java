import java.util.Scanner;

public class spiralmatrix {

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

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        System.out.println("Spiral Order:");

        while(top <= bottom && left <= right) {

            // left → right
            for(int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // top → bottom
            for(int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // right → left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom → top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
