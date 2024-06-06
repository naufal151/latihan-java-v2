import java.util.Scanner;

public class itinerary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int person = in.nextInt();
        int day = in.nextInt();
        int budget = in.nextInt();

        int[][] budgetArr = {
            {2170000, 125000, 75000, 250000},
            {3780000, 155000, 55000, 300000},
            {1200000, 170000, 85000, 360000},
            {4760000, 170000, 105000, 325000}
        };

        int[] estimatedBudget = new int[4];

        for (int i = 0; i < budgetArr.length; i++){
            if (budget < calculateBudget(budgetArr[i], person, day)){
                estimatedBudget[i] = 0;
            }
            else {
                estimatedBudget[i] = calculateBudget(budgetArr[i], person, day);
            }
        }

        if (isZero(estimatedBudget)){
            System.out.println("Need more budget");
        }
        else {
            int trip = chooseTrip(estimatedBudget);
            switch (trip) {
                case 0:
                    System.out.println("Lombok " + Integer.toString(estimatedBudget[trip]));
                    break;
                case 1:
                    System.out.println("Bangkok " + Integer.toString(estimatedBudget[trip]));
                    break;
                case 2:
                    System.out.println("Singapura " + Integer.toString(estimatedBudget[trip]));
                    break;
                case 3:
                    System.out.println("Tokyo " + Integer.toString(estimatedBudget[trip]));
                    break;
            }
        }

    }

    public static int calculateBudget(int[] arr, int person, int day){
        int flightBudget = arr[0] * person;
        int accommodationBudget = arr[1] * person * day;
        int culinaryBudget = arr[2] * person * day;
        int specialTour = arr[3] * person;
        int totalBudget = flightBudget + accommodationBudget + culinaryBudget + specialTour;

        return totalBudget;
    }

    public static int chooseTrip(int[] arr){
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean isZero(int[] arr){
        boolean checkZero = true;
        for (int i : arr){
            if (i != 0){
                checkZero = false;
            }
        }
        return checkZero;
    }
}