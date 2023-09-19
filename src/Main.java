import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //User Input
        System.out.print("Bill: ");
        String b = s.nextLine();
        double bill = Double.parseDouble(b);
        System.out.print("Tip Percent: ");
        String t = s.nextLine();
        int tipPercent = Integer.parseInt(t);
        System.out.print("Num of People: ");
        String n = s.nextLine();
        int numOfPpl = Integer.parseInt(n);

        //Calculations
        double tipPercentage = tipPercent * 0.01;
        double tipValue = bill * tipPercentage;
        double totalValue = bill + tipValue;
        double tipPPerson = tipValue / numOfPpl;
        double totalPPerson = totalValue / numOfPpl;

        //Printing it out
        System.out.print("-----------------------------------------------------");
        System.out.println();
        System.out.println("Total tip amount: $" + String.format("%.2f", tipValue));
        System.out.println("Total Paid: $" + String.format("%.2f", totalValue));
        System.out.println("Tip per Person: $" + String.format("%.2f", tipPPerson));
        System.out.print("Total per Person: $" + String.format("%.2f", totalPPerson));



    }
}