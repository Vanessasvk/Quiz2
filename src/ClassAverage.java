public class ClassAverage {
    public static double calculateClassAverage(double a, double b) {
        return (a + b) / 2;
    }public static double calculateClassAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }public static double calculateClassAverage(double[] scores) {
        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        return sum / scores.length;
    }
}
