import java.util.Scanner;

public class detik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int detikInput = in.nextInt();

        int[] nilai = {86400, 3600, 60, 1};
        int result;

        int currentValue = detikInput;

        for (int i = 0; i < nilai.length; i++){
            result = currentValue / nilai[i];
            System.out.println(result);
            currentValue = currentValue % nilai[i];
        }
    }
}