package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();

        for (int i=1; i<=numberTaxPayers;i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if (ch == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberEmployees));
            }
            sc.nextLine();
        }
        System.out.println();
        double totalTax = 0;
        System.out.println("TAXES PAID: ");
        for (TaxPayer taxPayer : list){
            double tax = taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
            totalTax += tax;
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f",totalTax ));
        sc.close();
    }
}
