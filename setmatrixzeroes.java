import java.util.*;

public class setmatrixzeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix:");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 1: mark rows & cols
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: update matrix
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Updated matrix:");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
