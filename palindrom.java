import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kalimat = in.nextLine();

        String kalimatTanpaSpasi = hapusSpasi(kalimat);
        boolean isPalindrom = isPalindrom(kalimatTanpaSpasi);
        int jumlahHuruf = hitungJumlahHuruf(kalimatTanpaSpasi);

        System.out.println(kalimatTanpaSpasi);
        System.out.println(isPalindrom);
        System.out.println(jumlahHuruf);
        if (isPalindrom){
            System.out.println("Silahkan Masuk");
        }
        else {
            System.out.println("Akses Ditolak");
        }
    }

    public static String hapusSpasi(String kalimat){
        String kalimatTanpaSpasi = kalimat.replaceAll(" ", "");
        return kalimatTanpaSpasi;
    }

    public static boolean isPalindrom(String kalimatTanpaSpasi){
        boolean cek = false;
        char[] kalimatArr = kalimatTanpaSpasi.toCharArray();

        String reversedKalimat = "";

        for (int i = 0; i < kalimatArr.length; i++){
            reversedKalimat = kalimatArr[i] + reversedKalimat;
        }

        if (reversedKalimat.equalsIgnoreCase(kalimatTanpaSpasi)){
            cek = true;
        }

        return cek;
    }

    public static int hitungJumlahHuruf(String kalimatTanpaSpasi){
        char[] kalimatArr = kalimatTanpaSpasi.toCharArray();
        int jumlahHuruf = kalimatArr.length;

        return jumlahHuruf;
    }
}