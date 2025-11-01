import java.util.Scanner;
public class JumlahKuadrat09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        int totalJumlahKuadrat = 0;
        String detailPerhitungan = "";
        
        for (int i = 1; i <= n; i++) {

            int kuadrat = 0;
            for (int j = 1; j <= i; j++) {
                kuadrat += i;
            }

            totalJumlahKuadrat += kuadrat;
            if (i == 1) {
                detailPerhitungan += kuadrat;
            } else {
                detailPerhitungan += " + " + kuadrat;
            }

            System.out.println("n = "+ i + " -> jumlah kuadrat = " + ((i == 1) ? totalJumlahKuadrat : (detailPerhitungan + " = " + totalJumlahKuadrat)));
        }
        sc.close();
    }
}
