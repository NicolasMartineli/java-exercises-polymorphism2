package poo_tax_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List <TaxPayer> list = new ArrayList<>();
        for( int i=1; i <=n; i++) {
            System.out.print("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (c == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpendiatures = sc.nextDouble();
                list.add(new Individual(anualIncome, name, healthExpendiatures));
            } else {
                System.out.print("Number of employess: ");
                int number = sc.nextInt();
                list.add(new Company(anualIncome, name, number));
            }
        }
        System.out.println();
        System.out.print("TAXES PAID: ");
        double sum = 0.0;
        for(TaxPayer tp: list){
           sum += tp.tax();
            System.out.println(tp.getName() + ":" + " $ " + String.format("%.2f", tp.tax()) );
        }
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
    sc.close();
    }
}