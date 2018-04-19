import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row arrNumber: ");
        row = scanner.nextInt();
        System.out.println("Enter col arrNumber: ");
        col = scanner.nextInt();
        double[][] arrNumber = new double[row][col];
        System.out.println();
        System.out.println("Enter arrNumber: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter elmenet" + '[' + i + ']' + '[' + j + ']' + ":");
                arrNumber[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Display arrNumber:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrNumber[i][j] + " ");
            }
            System.out.println();
        }
//        Location location = new Location();
        System.out.println(Location.locateLagest(arrNumber));
    }
}
