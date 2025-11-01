import java.util.Scanner;
public class PersegiAngka09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (nilai n minimal 3) = ");
            n = sc.nextInt();
        } while (n < 3);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.printf("%3d", n);
                } else {
                    System.out.printf("%-3s", " "); 
                }
            }
                System.out.println();
        }
        sc.close();
    }
}


