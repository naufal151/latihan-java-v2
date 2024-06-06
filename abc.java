import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String posisi = in.nextLine();
        String divisi = in.nextLine();

        String[] namaPosisi = {"software engineer", "data analyst", "ux designer", "project manager", "qa engineer"};
        String [] namaDivisi = {"surabaya", "jakarta", "bandung", "medan", "makassar"};

        int[][] gajiPokokArr = {
        //  surabaya  jakarta  bandung  medan   makassar
            {8000000, 9000000, 7500000, 7200000, 8500000},      //software engineer
            {7000000, 8000000, 6500000, 6200000, 7500000},      //data analyst
            {7500000, 8500000, 7000000, 6800000, 8000000},      //ex designer
            {10000000, 11000000, 9500000, 9200000, 10500000},   //project manager
            {7500000, 8500000, 7000000, 6800000, 8000000}       //qa engineer
        };

        int[] tunjanganTransportArr = {1000000, 1500000, 1200000, 1100000, 1300000};
        int tunjanganMakan = 50000;

        int gajiPokok = gajiPokok(gajiPokokArr, namaDivisi, namaPosisi, posisi, divisi);
        int tunjanganTransport = getTunjanganTransport(tunjanganTransportArr, namaDivisi, divisi);
        int tunjanganKesehatan = calculateTunjanganKesehatan(gajiPokok);
        int potonganBPJS = calculatePotonganBPJS(gajiPokok);
        int potonganPPH = calculatePotonganPPH(gajiPokok);
        int gajiBersih = calculateGajiBersih(gajiPokok, tunjanganTransport, tunjanganKesehatan, tunjanganMakan, potonganBPJS, potonganPPH);

        System.out.println(posisi);
        System.out.println(divisi);
        System.out.println("22 hari");
        formatCurrency(gajiBersih);
    }

    public static int gajiPokok(int[][] gajiArr, String[] namaDivisi, String[] namaPosisi, String posisi, String divisi){
        int gaji = 0;
    
        for (int i = 0; i < namaPosisi.length; i++){
            if (posisi.equalsIgnoreCase(namaPosisi[i])){
                for (int j = 0; j < namaDivisi.length; j++){
                    if (divisi.equalsIgnoreCase(namaDivisi[j])){
                        gaji = gajiArr[i][j];
                        break;
                    }
                }
                break;
            }
        }

        return gaji;
    }

    public static int getTunjanganTransport(int[] tunjanganTransportArr, String[] namaDivisi, String divisi){
        int tunjangan = 0;

        for (int i = 0; i < namaDivisi.length; i++){
            if (divisi.equalsIgnoreCase(namaDivisi[i])){
                tunjangan = tunjanganTransportArr[i];
                break;
            }
        }

        return tunjangan;
    }

    public static int calculateTunjanganKesehatan(int gajiPokok){
        int tunjangan = (int) (0.02 * gajiPokok);
        return tunjangan;
    }

    public static int calculatePotonganBPJS(int gajiPokok){
        int tunjangan = (int) (0.03 * gajiPokok);
        return tunjangan;
    }

    public static int calculatePotonganPPH(int gajiPokok){
        int tunjangan = (int) (0.05 * gajiPokok);
        return tunjangan;
    }

    public static int calculateGajiBersih(int gajiPokok, int tunjanganTransport, int tunjanganKesehatan, int tunjanganMakan, int potonganBPJS, int potonganPPH){
        int jumlahHariKerja = 22;
        int pendapatan = gajiPokok + tunjanganKesehatan + tunjanganTransport + (tunjanganMakan*jumlahHariKerja);
        int potongan = potonganBPJS + potonganPPH;
        int gajiBersih = pendapatan - potongan;

        return gajiBersih;
    }

    public static void formatCurrency(int gajiBersih){
        System.out.printf("%,.2f%n", (double) gajiBersih);
    }
    
}