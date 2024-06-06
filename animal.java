import java.util.Scanner;

public class animal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double minPersen = in.nextDouble();
        in.nextLine();
        String ciriA = in.nextLine();
        String ciriB = in.nextLine();

        double persentase = hitungPersentaseKesamaan(ciriA, ciriB);
        if (persentase >= minPersen){
            System.out.println("sama");
        }
        else {
            System.out.println("tidak sama");
        }
    }

    public static double hitungPersentaseKesamaan(String ciriA, String ciriB){
        // buang spasi dalam string
        String ciriATanpaSpasi = ciriA.replaceAll(" ", "");
        String ciriBTanpaSpasi = ciriB.replaceAll(" ", "");

        // masukkan setiap karakter dalam string ke dalam array
        char[] ciriAArr = ciriATanpaSpasi.toCharArray();
        char[] ciriBArr = ciriBTanpaSpasi.toCharArray();

        //cek setiap elemen di array kedua terhadap elemen di array pertama
        int totalKarakterSama = 0;

        for (int i = 0; i < ciriAArr.length; i++){
            for (int j = 0; j < ciriBArr.length; j++){
                if (ciriBArr[j] == ciriAArr[i]){
                    totalKarakterSama += 1;
                    break;
                }
            }
        }

        double persentase = ((double) totalKarakterSama / ciriAArr.length) * 100;
        return persentase;
    }
    
}