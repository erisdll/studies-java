package oopintro.exercise4.util;

public class CurrencyConverter {
    public static double convertCurrencyWithTax(
            double amountToConvert,
            double conversionRatio,
            double taxPercentage
    ) {
        double amountToConvertWithTax = amountToConvert + (amountToConvert * taxPercentage/100);
        return amountToConvertWithTax * conversionRatio;
    }
}
