import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int col = sc.nextInt();
        int loc = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][col];
            matrix[i][col] = matrix[i][loc];
            matrix[i][loc] = temp;
        }

        for (int[] ele : matrix) {
            for (int num : ele) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}