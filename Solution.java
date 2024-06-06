import java.util.Scanner;

public class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] intArray = new int[n];
        int isBiggest = 0;

        for (int i = 0; i < n; i++){
            int x = in.nextInt();
            intArray[i] = x;
        }

        for (int j = 0; j < intArray.length; j++){
            if (intArray[j] > intArray[j+1]){
                isBiggest = intArray[j];
            }
            else if (intArray[j] < intArray[j+1]){
                isBiggest = intArray[j+1];
            }
        }

        System.out.println(isBiggest);
    }
}