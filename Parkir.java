import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kendaraan = input.nextInt();
        int durasi = input.nextInt();

        int[][] biayaParkirArray = {
            {5000, 2000, 10000},    // biaya parkir 1 jam pertama
            {2000, 1000, 5000},     // biaya parkir jam berikutnya
            {25000, 10000, 50000}   // biaya parkir maksimal
        };

        if (kendaraan < 1 || kendaraan > 3 || durasi < 1){
            System.out.println("Input Error");
        }
        else {
            int biaya = hitungBiayaParkir(biayaParkirArray[0][kendaraan - 1], biayaParkirArray[1][kendaraan - 1], durasi);
            if (biaya > biayaParkirArray[2][kendaraan - 1]){
                System.out.println(biayaParkirArray[2][kendaraan - 1]);
            }
            else {
                System.out.println(biaya);
            }
        }

    }

    public static int hitungBiayaParkir(int n, int m, int t){
        int totalBiaya = n + (t - 1) * m;
        return totalBiaya;        
    }

}
