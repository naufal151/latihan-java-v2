import java.util.Scanner;

public class lubangHuruf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kalimat = in.nextLine();
        char[] kalimatArr = kalimat.toCharArray();

        char[] karakterBerlubang = {'a', 'A', 'b', 'B', 'd', 'D', 'o', 'O', 'p', 'P', 'q', 'Q','R', 'e', 'g', '0', '4', '6', '8', '9'};

        int jumlahLubang = 0;

        for (int i = 0; i < kalimatArr.length; i++){
            if (cekHuruf(karakterBerlubang, kalimatArr[i])){
                if (kalimatArr[i] == 'B' || kalimatArr[i] == '8'){
                    jumlahLubang = jumlahLubang + 2;
                }
                else {
                    jumlahLubang = jumlahLubang + 1;
                }
            }
        }
        System.out.println(jumlahLubang);
    }

    public static boolean cekHuruf(char[] arr, char x){
        boolean hasil = false;
        for (char i : arr){
            if (i == x){
                hasil = true;
                break;
            }
        }
        return hasil;
    }
}