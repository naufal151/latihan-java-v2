import java.util.Scanner;

public class romanNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        String[][] romanList = {
            {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"M", "MM", "MMM"}
        };

        String reversed = reversePosition(x);
        String roman = "";

        for (int i = 0; i < reversed.length(); i++){
            int charToInt = reversed.charAt(i) - '0';
            if (charToInt > 0){
                roman = romanList[i][charToInt - 1] + roman;
            }
        }
        System.out.println(roman);

    }

    public static String reversePosition(int x){
        String original = Integer.toString(x);
        String reversed = "";

        for (int i = 0; i < original.length(); i++){
            char n = original.charAt(i);
            reversed = n + reversed;
        }

        return reversed;
    }
}