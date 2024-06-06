import java.util.Scanner;

public class rythm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama = in.nextLine();
        int perfectCount = in.nextInt();
        int greatCount = in.nextInt();
        int goodCount = in.nextInt();
        int missCount = in.nextInt();

        int totalScore = calculateScore(perfectCount, greatCount, goodCount, missCount);
        double percentage = calculateTotalMaxScore(totalScore);
        String rank = getRank(percentage);
        printResult(nama, totalScore, rank);

    }

    public static int calculateScore(int perfectCount, int greatCount, int goodCount, int missCount){
        int perfect = 100 * perfectCount;
        int great = 80 * greatCount;
        int good = 60 * goodCount;
        int totalScore = perfect + great + good;

        return totalScore;
    }

    public static double calculateTotalMaxScore(int totalScore){
        int maxScore = 10000;
        double percentage = ((double) totalScore / maxScore) * 100;

        return percentage;
    }

    public static String getRank(double percentage){
        String rank = "";

        if (percentage >= 90){
            rank = "S (Super)";
        }
        else if (percentage >= 80 && percentage < 90){
            rank = "A (Amazing)";
        }
        else if (percentage >= 70 && percentage < 80){
            rank = "B (Brilliant)";
        }
        else if (percentage >= 60 && percentage < 70){
            rank = "C (Cool)";
        }
        else {
            rank = "D (Decent)";
        }

        return rank;
    }

    public static void printResult(String playerName, int totalScore, String rank){
        System.out.println(totalScore);
        System.out.println(playerName + " peringkat " + rank);
    }
}