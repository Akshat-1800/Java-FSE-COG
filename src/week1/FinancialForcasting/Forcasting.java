package week1.FinancialForcasting;

public class Forcasting {

    // Recursive method to predict future value
    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double predictedValue =
                futureValue(presentValue,
                        growthRate,
                        years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf(
                "Future Value  : %.2f%n",
                predictedValue
        );
    }
}
