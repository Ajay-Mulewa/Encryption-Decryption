import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] nums = new int[n][n];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = Math.abs(i - j);
            }
        }

        for (int[] num : nums) {
            for (int inner : num) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}