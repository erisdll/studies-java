package oopintro.exercise4.application;

import oopintro.exercise4.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many dollars do you wish to buy?");
        double amountToBuy = scanner.nextDouble();
        System.out.println("What is the current USD value in BRL?");
        double conversionRatio = scanner.nextDouble();
        System.out.println("What's the current IOF tax percentage?");
        double iofTaxPercentage = scanner.nextDouble();

        System.out.println("Amount to be paid in BRL is: " +
            CurrencyConverter.convertCurrencyWithTax(
                amountToBuy,
                conversionRatio,
                iofTaxPercentage
            )
        );
    }
}
