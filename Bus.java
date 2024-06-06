import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int penumpang = in.nextInt();

        int[][] kapasitasHargaBus = {
            {12, 18, 32, 45, 60},
            {1300000, 1500000, 1800000, 2000000, 2300000}
        };

        if (penumpang > 120){
            System.out.println("Error: input melebihi batas");
        }
        else {
            if (penumpang > kapasitasHargaBus[0][kapasitasHargaBus[0].length - 1]){
                int penumpangLebih = penumpang - kapasitasHargaBus[0][kapasitasHargaBus[0].length - 1];
                int totalHarga = kapasitasHargaBus[1][kapasitasHargaBus[0].length - 1] + cariHargaList(penumpangLebih, kapasitasHargaBus);
                System.out.println(totalHarga);
            }
            else {
                int hargaBus = cariHargaList(penumpang, kapasitasHargaBus);
                System.out.println(hargaBus);
            }
        }   
    }

    public static int cariHargaList(int n, int[][] arr){
        // input parameter n adalah jumlah penumpang
        // input parameter arr adalah array 2D dengan elemen jumlah penumpang dan harga bus
        
        int harga = 0;
        for (int i = 0; i < arr[0].length - 1; i++){
            if (n <= arr[0][i]){
                harga = arr[1][i];
                break;
            }
            else if (n > arr[0][i] && n <= arr[0][i+1]){
                harga = arr[1][i+1];
                break;
            }
        }
        return harga;
    }
}