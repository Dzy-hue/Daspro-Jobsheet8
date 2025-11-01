import java.util.Scanner;
public class ProgramKafe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.print("\nJumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---"); 
            int totalItemCabang = 0;

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
        
            totalPelanggan += jumlahPelanggan;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int itemPerPelanggan = sc.nextInt(); 
                totalItemCabang += itemPerPelanggan;
            }

            totalItem += totalItemCabang;
            System.out.println("Cabang " + i + ":"); 
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang"); 
            System.out.println("- Item terjual: " + totalItemCabang); 
        }

        System.out.println("\nTotal seluruh Cabang:"); 
        System.out.println("Pelanggan: " + totalPelanggan + " orang"); 
        System.out.println("Item terjual: " + totalItem + " item"); 
        sc.close();
    }
}