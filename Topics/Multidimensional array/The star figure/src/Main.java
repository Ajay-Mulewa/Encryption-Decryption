import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[][] pattern = new String[n][n];

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                pattern[i][j] = ". ";
                if (i == n / 2 || j == n / 2 || i == j || i == n - j - 1) {
                    pattern[i][j] = "* ";
                }
            }
        }

        for (String[] strings : pattern) {
            for (int j = 0; j < pattern.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }

    }
}