public class Main {
    public static void main(String[] args) {
        GradeReport.executeGradeReport(85.0);
        GradeReport.executeGradeReport(120);


        //question2
    double average2 = ClassAverage.calculateClassAverage(70, 80);


    double average3 = ClassAverage.calculateClassAverage(60, 75, 90);


    double[] scores = {65, 70, 80, 90};
    double avArray = ClassAverage.calculateClassAverage(scores);

            System.out.println("Average (2 scores): "+average2);
            System.out.println("Average (3 scores): "+average3);
            System.out.println("Average (array): "+avArray);

}

}