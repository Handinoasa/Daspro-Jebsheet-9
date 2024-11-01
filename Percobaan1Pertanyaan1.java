public class Percobaan1Pertanyaan1 {

    public static void main(String[] args) {
        // Use double array to hold floating-point values
        double[] bil = new double[4];
        bil[0] = 5.0;        // Use a double instead of an int
        bil[1] = 12867;      // This is fine as it can be stored in double
        bil[2] = 7.5;        // Use a double instead of an int
        bil[3] = 2000000;    // This is fine as it can be stored in double

        // Print each value in the array
        for (double value : bil) {
            System.out.println(value);
        }
    }
}
