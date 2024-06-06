import java.util.Scanner;

public class sandi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kalimat = in.nextLine();

        String[] sandiArr = encodeToSandi(kalimat);
        System.out.println(generateSandiString(sandiArr));
    }

    private static String[] encodeToSandi(String input){
        char[] charArr = input.toCharArray();
        String[] charSandiArr = new String[charArr.length];

        for (int i = 0; i < charArr.length; i++){
            charSandiArr[i] = String.valueOf(getSandiNumber(charArr[i])).repeat(getCount(charArr[i]));
        }

        return charSandiArr;
    }

    private static int getSandiNumber(char c){
        int result = 0;

        switch (c) {
            case ' ':
                result = 0;
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = 1;
                break;
            case 'E':
            case 'F':
            case 'G':
            case 'H':
                result = 2;
                break;
            case 'I':
            case 'J':
            case 'K':
            case 'L':
                result = 3;
                break;
            case 'M':
            case 'N':
            case 'O':
            case 'P':
                result = 4;
                break;
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
                result = 5;
                break;
            case 'U':
            case 'V':
            case 'W':
            case 'X':
                result = 6;
                break;
            case 'Y':
            case 'Z':
                result = 7;
                break;
        }

        return result;
    }

    private static int getCount(char c){
        int result = 0;

        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'M':
            case 'Q':
            case 'U':
            case 'Y':
            case ' ':
                result = 1;
                break;
            case 'B':
            case 'F':
            case 'J':
            case 'N':
            case 'R':
            case 'V':
            case 'Z':
                result = 2;
                break;
            case 'C':
            case 'G':
            case 'K':
            case 'O':
            case 'S':
            case 'W':
                result = 3;
                break;
            case 'D':
            case 'H':
            case 'L':
            case 'P':
            case 'T':
            case 'X':
                result = 4;
                break;
        }

        return result;

    }

    private static String generateSandiString(String[] sandi){
        String generatedSandi = "";
        for (int i = 0; i < sandi.length; i++){
            if (i > 0 && sandi[i].charAt(0) == sandi[i - 1].charAt(0)) {
                // generatedSandi.append("-");
                generatedSandi = generatedSandi + "-";
            }
            generatedSandi = generatedSandi + sandi[i]; 

        }

        return generatedSandi;
    }

}