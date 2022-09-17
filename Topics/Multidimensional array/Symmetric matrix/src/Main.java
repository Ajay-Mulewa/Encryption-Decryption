import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean sym = true;

        int[][] nums = new int[n][n];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] != nums[j][i]) {
                    sym = false;
                    break;
                }
            }
        }

        if (sym) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}