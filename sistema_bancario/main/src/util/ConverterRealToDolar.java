package util;

public class ConverterRealToDolar {
    private static double cot = 5.22;

    public static void setCotDolar(double cot) {
        ConverterRealToDolar.cot = cot;
    }

    public static double getCotDolar () {
        return cot;
    }

    public static double converter (double valReal) {
        return valReal / cot;
    }
}
