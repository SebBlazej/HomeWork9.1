package etc;

public class QuickMath {

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isNegative(double number) {
        return number < 0;
    }

    public static int divWithoutDecimal(double number, double dividedBy) {
        return (int) (number / dividedBy);
    }

    public static double findNumberDividorByProportions(double xDividend, double xDividor, double yDividend) {
        return (xDividor * yDividend) / xDividend;
    }

    public static double findNumberDividendByProportions(double xDividend, double xDividor, double yDividend) {
        return (xDividend * yDividend) / xDividor;
    }

}
