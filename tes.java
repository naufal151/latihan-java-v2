public class tes {

    public static void main(String[] args) {
        System.out.println(Tunjangan("kawin", 2000000));
    }

    public static int Tunjangan(String status, int gaji){
        int result = 0;

        if (status.equalsIgnoreCase("kawin")){
            result = (int) (0.1 * gaji);
        }

        return result;
    }
}