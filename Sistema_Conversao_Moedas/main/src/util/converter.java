package util;

public class converter {
    public static String cotacao(double dolarCot, double quantDol) {
        double IOF = 6 * dolarCot / 100;
        return String.format("O valor a ser pago em reais é de: %.2f ",(dolarCot + IOF)*quantDol );
    };
}
