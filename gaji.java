import java.util.Scanner;

public class gaji {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cabang = in.nextLine();
        String posisi = in.nextLine();
        int lamaKerja = in.nextInt();
        boolean statusNikah = in.nextBoolean();

        String[] kota = {"Garut", "Bandung", "Jakarta", "Bekasi", "Bogor", "Palembang"};
        int[] umk = {1961085, 3742276, 4453935, 4782935, 4330249, 3289409};

        int gajiPokok = gajiPokok(kota, umk, cabang, posisi, lamaKerja);
        int tunjanganKeluarga = 0;
        if (statusNikah){
            tunjanganKeluarga = (int) (0.1 * gajiPokok);
        }

        int tunjanganJabatan = 0;
        if (lamaKerja > 4){
            tunjanganJabatan = (int) (0.05 * gajiPokok);
        }
        
        int tunjanganPegawai = tunjanganPegawai(posisi);
        int gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganJabatan + tunjanganPegawai;

        int potonganPensiun = (int) (0.02 * gajiKotor);
        int potonganBPJS = (int) (0.02 * gajiKotor);
        int potonganPPH = (int) (0.05 * gajiKotor);
        int totalPotongan = potonganPensiun + potonganBPJS + potonganPPH;


        System.out.println(gajiPokok);
        System.out.println(tunjanganKeluarga);
        System.out.println(tunjanganJabatan);
        System.out.println(tunjanganPegawai);
        System.out.println(gajiKotor);
        System.out.println(potonganPensiun);
        System.out.println(potonganBPJS);
        System.out.println(potonganPPH);
        System.out.println(gajiKotor - totalPotongan);
    } 

    public static int umk(String[] kotaArr, int[] umkArr, String kota){
        int result = 0;
         for (int i = 0; i < kotaArr.length; i++){
            if (kota.equalsIgnoreCase(kotaArr[i])){
                result = umkArr[i];
            }
         }
        return result;
    }

    public static int gajiPokok(String[] kotaArr, int[] umkArr, String cabang, String posisi, int t){
        int result = 0;

        if (posisi.equalsIgnoreCase("Admin")){
            if (t < 2){
                result = umk(kotaArr, umkArr, cabang);
            }
            else {
                result = (int) (1.2 * umk(kotaArr, umkArr, cabang));
            }
        }
        else if (posisi.equalsIgnoreCase("Coordinator")){
            if (t < 3){
                result = (int) (1.1 * umk(kotaArr, umkArr, cabang));
            }
            else {
                result = (int) (1.3 * umk(kotaArr, umkArr, cabang));
            }
        }
        else if (posisi.equalsIgnoreCase("SPV")){
            if (t < 2){
                result = (int) (1.25 * umk(kotaArr, umkArr, cabang));
            }
            else if (t >= 2 && t <= 4){
                result = (int) (1.4 * umk(kotaArr, umkArr, cabang));
            }
            else {
                result = (int) (1.5 * umk(kotaArr, umkArr, cabang));
            }
        }
        else if (posisi.equalsIgnoreCase("Manager")){
            if (t < 3){
                result = (int) (1.5 * umk(kotaArr, umkArr, cabang));
            }
            else {
                result = (int) (2 * umk(kotaArr, umkArr, cabang));
            }
        }
        else if (posisi.equalsIgnoreCase("Sprinter")){
            result = (int) (0.9 * umk(kotaArr, umkArr, cabang));
        }
        else if (posisi.equalsIgnoreCase("Officer")){
            result = umk(kotaArr, umkArr, cabang);
        }

        return result;
    }

    public static int tunjanganPegawai(String posisi){
        int result = 0;

        if (posisi.equalsIgnoreCase("Admin")){
            result = 200000;
        }
        else if (posisi.equalsIgnoreCase("Coordinator")){
            result = 500000;
        }
        else if (posisi.equalsIgnoreCase("SPV")){
            result = 700000;
        }
        else if (posisi.equalsIgnoreCase("Manager")){
            result = 1000000;
        }
        else if (posisi.equalsIgnoreCase("Sprinter")){
            result = 200000;
        }
        else if (posisi.equalsIgnoreCase("Officer")){
            result = 200000;
        }

        return result;
    }

}