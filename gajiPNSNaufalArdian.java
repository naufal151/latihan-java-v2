import java.util.Scanner;
/*
 * Created By: Naufal Ardian
 * Created At: 20.00 Selasa, 4 Juni 2024
 */

public class gajiPNSNaufalArdian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] ruangKerjaArr = {"A", "B", "C", "D", "E"};
        int[] tunjanganJabatanArr = {175000, 180000, 185000, 190000};
        int[] taperumArr = {3000, 5000, 7000, 10000};
        int[][][] gajiPokokGolonganArr = {
        { //golongan I
            {1560800, 1560800, 1560800, 1560800},
            {1560800, 1560800, 1560800, 1560800},
            {1610000, 1610000, 1610000, 1610000}, 
            {1610000, 1704500, 1776600, 1851800},
            {1660700, 1704500, 1776600, 1851800},
            {1660700, 1758200, 1832600, 1910100},
            {1713000, 1758200, 1832600, 1910100},
            {1713000, 1813600, 1890300, 1970200},
            {1766900, 1813600, 1890300, 1970200},
            {1766900, 1870700, 1949800, 2032300},
            {1822600, 1870700, 1949800, 2032300},
            {1822600, 1929600, 2011200, 2096300},
            {1880000, 1929600, 2011200, 2096300},
            {1880000, 1990400, 2074600, 2162300},
            {1939200, 1990400, 2074600, 2162300},
            {1939200, 2053100, 2139900, 2230400},
            {2000300, 2053100, 2139900, 2230400},
            {2000300, 2117700, 2207300, 2300700},
            {2063300, 2117700, 2207300, 2300700},
            {2063300, 2184400, 2276800, 2373100},
            {2128300, 2184400, 2276800, 2373100},
            {2128300, 2253200, 2348500, 2447900},
            {2195300, 2253200, 2348500, 2447900},
            {2195300, 2324200, 2422500, 2525000},
            {2264400, 2324200, 2422500, 2525000},
            {2264400, 2397400, 2498800, 2604500},
            {2335800, 2397400, 2498800, 2604500},
            {2335800, 2472900, 2557500, 2686500}
        },
        { // golongan II
            {2022200, 2022200, 2022200, 2022200},
            {2054100, 2054100, 2054100, 2054100},
            {2054100, 2054100, 2054100, 2054100},
            {2118800, 2208400, 2301800, 2399200},
            {2118800, 2208400, 2301800, 2399200},
            {2185500, 2277900, 2374300, 2474700},
            {2185500, 2277900, 2374300, 2474700},
            {2254300, 2349700, 2449100, 2552700},
            {2254300, 2349700, 2449100, 2552700},
            {2325300, 2423700, 2526200, 2633100},
            {2325300, 2423700, 2526200, 2633100},
            {2398600, 2500000, 2605800, 2716000},
            {2398600, 2500000, 2605800, 2716000},
            {2474100, 2578800, 2687800, 2801500},
            {2474100, 2578800, 2687800, 2801500},
            {2552000, 2660000, 2772500, 2889800},
            {2552000, 2660000, 2772500, 2889800},
            {2632400, 2743800, 2859800, 2980800},
            {2632400, 2743800, 2859800, 2980800},
            {2715300, 2830200, 2949900, 3074700},
            {2715300, 2830200, 2949900, 3074700},
            {2800800, 2919300, 3042800, 3171500},
            {2800800, 2919300, 3042800, 3171500},
            {2889100, 3011200, 3138600, 3271400},
            {2889100, 3011200, 3138600, 3271400},
            {2980000, 3106100, 3237500, 3374400},
            {2980000, 3106100, 3237500, 3374400},
            {3073900, 3203900, 3339400, 3480700},
            {3073900, 3203900, 3339400, 3480700},
            {3170700, 3304800, 3444600, 3590300},
            {3170700, 3304800, 3444600, 3590300},
            {3270600, 3408900, 3553100, 3703400},
            {3270600, 3408900, 3553100, 3703400},
            {3373600, 3516300, 3665000, 3820000}
        },
        { // golongan III
            {2579400, 2688500, 2802300, 2920800},
            {2579400, 2688500, 2802300, 2920800},
            {2660700, 2773200, 2890500, 3012800},
            {2660700, 2773200, 2890500, 3012800},
            {2744500, 2860500, 2981500, 3107700},
            {2744500, 2860500, 2981500, 3107700},
            {2830900, 2950600, 3075500, 3205500},
            {2830900, 2950600, 3075500, 3205500},
            {2920100, 3043600, 3172300, 3306500},
            {2920100, 3043600, 3172300, 3306500},
            {3012000, 3139400, 3272200, 3410600},
            {3012000, 3139400, 3272200, 3410600},
            {3106900, 3238300, 3375300, 3518100},
            {3106900, 3238300, 3375300, 3518100},
            {3204700, 3340300, 3481600, 3628900},
            {3204700, 3340300, 3481600, 3628900},
            {3305700, 3445500, 3591200, 3743100},
            {3305700, 3445500, 3591200, 3743100},
            {3409800, 3554000, 3704300, 3861000},
            {3409800, 3554000, 3704300, 3861000},
            {3517200, 3665900, 3821000, 3982600},
            {3517200, 3665900, 3821000, 3982600},
            {3627900, 3781400, 3941400, 4108100},
            {3627900, 3781400, 3941400, 4108100},
            {3742200, 3900500, 4065500, 4237500},
            {3742200, 3900500, 4065500, 4237500},
            {3860100, 4023300, 4193500, 4370900},
            {3860100, 4023300, 4193500, 4370900},
            {3981600, 4150100, 4325600, 4508600},
            {3981600, 4150100, 4325600, 4508600},
            {4107000, 4280800, 4461800, 4650600},
            {4107000, 4280800, 4461800, 4650600},
            {4236400, 4415600, 4602400, 4797000}
        },
        { // golongan IV
            {3044300, 3173100, 3307300, 3447200, 3593100},
            {3044300, 3173100, 3307300, 3447200, 3593100},
            {3140200, 3272100, 3411500, 3555800, 3706200},
            {3140200, 3272100, 3411500, 3555800, 3706200},
            {3239100, 3376100, 3518900, 3667800, 3822900},
            {3239100, 3376100, 3518900, 3667800, 3822900},
            {3341100, 3482500, 3629800, 3783300, 3943300},
            {3341100, 3482500, 3629800, 3783300, 3943300},
            {3446400, 3592100, 3744100, 3902500, 4067500},
            {3446400, 3592100, 3744100, 3902500, 4067500},
            {3554900, 3705300, 3862000, 4025400, 4195700},
            {3554900, 3705300, 3862000, 4025400, 4195700},
            {3666900, 3822000, 3983600, 4152200, 4327800},
            {3666900, 3822000, 3983600, 4152200, 4327800},
            {3782400, 3942400, 4109100, 4282900, 4462100},
            {3782400, 3942400, 4109100, 4282900, 4462100},
            {3901500, 4066500, 4238500, 4417800, 4604700},
            {3901500, 4066500, 4238500, 4417800, 4604700},
            {4024400, 4194600, 4372000, 4557000, 4749700},
            {4024400, 4194600, 4372000, 4557000, 4749700},
            {4151100, 4326700, 4509700, 4700500, 4899300},
            {4151100, 4326700, 4509700, 4700500, 4899300},
            {4281800, 4463000, 4651800, 4848500, 5053600},
            {4281800, 4463000, 4651800, 4848500, 5053600},
            {4416700, 4603500, 4798300, 5001200, 5212800},
            {4416700, 4603500, 4798300, 5001200, 5212800},
            {4555800, 4748500, 4949400, 5158700, 5377000},
            {4555800, 4748500, 4949400, 5158700, 5377000},
            {4699300, 4898100, 5105300, 5321200, 5546300},
            {4699300, 4898100, 5105300, 5321200, 5546300},
            {4847300, 5052300, 5266100, 5488800, 5721000},
            {4847300, 5052300, 5266100, 5488800, 5721000},
            {5000000, 5211500, 5431900, 5661700, 5901200}
        }
        };
        String regexGolongan = "^[1-4]$";
        String regexAngka = "^(0?\\d|[1-4]\\d|50)$";
        String regexHuruf;

        // Input
        System.out.println("Silakan masukkan nama Anda: ");
        String nama = in.nextLine();
        int golongan = Integer.valueOf(validateInput(in, "Silakan Masukkan Golongan Anda: ", regexGolongan));
        String ruangKerja = "";
        if (golongan == 4){
            regexHuruf = "^[a-eA-E]*$";
            ruangKerja = validateInput(in, "Silakan Masukkan Ruang Kerja Anda (A - E): ", regexHuruf);
        }
        else {
            regexHuruf = "^[a-dA-D]*$";
            ruangKerja = validateInput(in, "Silakan Masukkan Ruang Kerja Anda (A - D): ", regexHuruf);
        }

        int lamaKerja = Integer.valueOf(validateInput(in, "Silakan Masukkan Masa Kerja Anda: ", regexAngka));

        if (lamaKerja > gajiPokokGolonganArr[golongan - 1].length - 1){
            lamaKerja = gajiPokokGolonganArr[golongan - 1].length - 1;
        }
        String statusKawin;
        do {
            System.out.println("Silakan Masukkan Status Pernikahan Anda: ");
            statusKawin = in.nextLine();
            if (!statusKawin.equalsIgnoreCase("kawin") && !statusKawin.equalsIgnoreCase("cerai") && !statusKawin.equalsIgnoreCase("belum kawin")){
                System.out.println("Coba lagi!");
            }
        }
        while (!statusKawin.equalsIgnoreCase("kawin") && !statusKawin.equalsIgnoreCase("cerai") && !statusKawin.equalsIgnoreCase("belum kawin"));
        
        int jumlahAnak = Integer.valueOf(validateInput(in, "Silakan Masukkan Jumlah Anak Anda: ", regexAngka));

        // Hitung
        int gajiPokok = getGajiPokok(gajiPokokGolonganArr, ruangKerjaArr, golongan, ruangKerja, lamaKerja);
        double tunjanganKeluarga = calculateTunjanganKeluarga(statusKawin, gajiPokok);
        double tunjanganAnak = calculateTunjanganAnak(jumlahAnak, gajiPokok);
        double tunjanganBeras = tunjanganBeras(statusKawin, jumlahAnak);
        int tunjanganJabatan = getTunjanganJabatan(tunjanganJabatanArr, golongan);
        double gajiKotor = calculateGajiKotor(gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganJabatan);
        double potonganPPH = 0;
        if (gajiKotor > 4500000){
            potonganPPH = calculatePotonganPPH(gajiKotor, gajiPokok, statusKawin, tunjanganKeluarga, tunjanganAnak, jumlahAnak);
        }
        double potonganIWP = calculatePotonganIWP(gajiPokok, tunjanganAnak, tunjanganKeluarga);
        double potonganTaperum = getPotonganTaperum(taperumArr, golongan);
        double gajiBersih = calculateGajiBersih(gajiKotor, potonganPPH, potonganIWP, potonganTaperum);
        displayOutput(nama, gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganJabatan, gajiKotor, potonganPPH, potonganIWP, potonganTaperum, gajiBersih);
    }

    public static String validateInput(Scanner input, String pertanyaan, String regex){
        String nilaiInput;
        do {
            System.out.println(pertanyaan);
            nilaiInput = input.nextLine();
            if (!nilaiInput.matches(regex)) {
                System.out.println("Coba lagi!");
            }
        } while (!nilaiInput.matches(regex));

        return nilaiInput;
    }

    public static int getGajiPokok(int[][][] gajiArr, String[] ruangKerjaArr, int golongan, String ruangKerja, int lamaKerja){
        int gajiPokok = 0;

        for (int i = 0; i < gajiArr[golongan - 1][lamaKerja].length; i++){
            for (int j = 0; j < ruangKerjaArr.length; j++){
                if (ruangKerja.equalsIgnoreCase(ruangKerjaArr[j])){
                    gajiPokok = gajiArr[golongan - 1][lamaKerja][j];
                    break;
                }
            }
        }

        return gajiPokok;
    }

    public static double calculateTunjanganKeluarga(String statusKawin, int gajiPokok){
        double tunjangan = 0;
        if (statusKawin.equalsIgnoreCase("kawin")){
            tunjangan = 0.1 * gajiPokok;
        }

        return tunjangan;
    }

    public static double calculateTunjanganAnak(int jumlahAnak, int gajiPokok){
        double tunjangan = 0;
        if (jumlahAnak > 2){
            tunjangan = 2 * 0.02 * gajiPokok;
        }
        else {
            tunjangan = jumlahAnak * 0.02 * gajiPokok;
        }

        return tunjangan;
    }

    public static int tunjanganBeras(String statusKawin, int jumlahAnak){
        int totalAnggotaKeluarga = 1 + jumlahAnak;
        if (jumlahAnak > 2){
            totalAnggotaKeluarga = 3;
        }
        int tunjangan = 150000;

        if (statusKawin.equalsIgnoreCase("kawin")){
            totalAnggotaKeluarga += 1;
            tunjangan *= totalAnggotaKeluarga;
        }
        else if (statusKawin.equalsIgnoreCase("cerai")){
            tunjangan *= totalAnggotaKeluarga;
        }

        return tunjangan;
    }

    public static int getTunjanganJabatan(int[] tunjanganJabatanArr, int golongan){
        int tunjangan = tunjanganJabatanArr[golongan - 1];
        return tunjangan;
    }

    public static double calculateGajiKotor(int gajiPokok, double tunjanganKeluarga, double tunjanganAnak, double tunjanganBeras, double tunjanganJabatan){
        double gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganAnak + tunjanganBeras + tunjanganJabatan;
        return gajiKotor;
    }

    public static double calculatePotonganPPH(double gajiKotor, int gajiPokok, String statusKawin, double tunjanganKeluarga, double tunjanganAnak, int jumlahAnak){
        double biayaJabatan = 0.05 * gajiKotor;
        double iuranPensiun = 0.0475 * (gajiPokok + tunjanganAnak + tunjanganKeluarga);
        double penghasilanNeto = gajiKotor - (biayaJabatan + iuranPensiun);
        double penghasilanNetoSetahun = penghasilanNeto * 12;
        double ptkp = 36000000 + (jumlahAnak * 3000000);
        if (jumlahAnak > 3){
            ptkp = 36000000 + (3 * 3000000);
        }

        if (statusKawin.equalsIgnoreCase("kawin")){
            ptkp += 3000000;
        }

        double pkp = penghasilanNetoSetahun - ptkp;
        double pphSetahun = 0.05 * pkp;
        double pphSebulan = pphSetahun / 12;

        return pphSebulan;
    }

    public static double calculatePotonganIWP(int gajiPokok, double tunjanganAnak, double tunjanganKeluarga){
        double iwp = 0.1 * (gajiPokok + tunjanganAnak + tunjanganKeluarga);
        return iwp;
    }

    public static int getPotonganTaperum(int[] taperumArr, int golongan){
        int taperum = taperumArr[golongan - 1];
        return taperum;
    }

    public static double calculateGajiBersih(double gajiKotor, double potonganPPH, double potonganIWP, double potonganTaperum){
        double totalPotongan = potonganIWP + potonganPPH + potonganTaperum;
        double gajiBersih = gajiKotor - totalPotongan;
        return gajiBersih;
    }

    public static void displayOutput(String nama, int gajiPokok, double tunjanganKeluarga, double tunjanganAnak, double tunjanganBeras, int tunjanganJabatan, double gajiKotor, double potonganPPH, double potonganIWP, double potonganTaperum, double gajiBersih){
        System.out.println(nama);
        System.out.printf("Gaji Pokok: %,.2f%n", (double) gajiPokok);
        System.out.printf("Tunjangan Keluarga: %,.2f%n", tunjanganKeluarga);
        System.out.printf("Tunjangan Anak: %,.2f%n", tunjanganAnak);
        System.out.printf("Tunjangan Beras: %,.2f%n", tunjanganBeras);
        System.out.printf("Tunjangan Umum Jabatan: %,.2f%n", (double) tunjanganJabatan);
        System.out.printf("Gaji Bruto: %,.2f%n", gajiKotor);
        System.out.printf("PPH21: %,.2f%n", potonganPPH);
        System.out.printf("Potongan IWP: %,.2f%n", potonganIWP);
        System.out.printf("Potongan Taperum: %,.2f%n", potonganTaperum);
        System.out.printf("Gaji Take Home Pay: %,.2f%n", gajiBersih);
    }
}