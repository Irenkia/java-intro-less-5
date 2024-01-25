package org.example;

public class Main {
    public static void main(String[] args) {
        forBillCalculator();
    }
    public static void forBillCalculator() {
        double bill = 200;
        float payOfServices = 0.3f;
        double discount = 1.5;
        short packagingFee = 5;

        System.out.println("\nOur bill = " + bill);
        System.out.print("\nWith service fee (0.3%) : 200 + 0.60 = ");
        System.out.print(BillCalculator.calculateBill(bill, payOfServices));

        System.out.println("\n\nWith service fee (0.3%) and minus discount (1.5%) ");
        System.out.println("the discount applies only to the invoice amount and not to the service fee :");
        System.out.print("(200 - 3) + 0.60 = ");
        System.out.println(BillCalculator.calculateBill(bill, payOfServices, discount));

        System.out.print("\n\nWith service fee (0.3%) and takeaway packaging fee (fix price = 5) : 200 + 0.60 + 5 = ");
        System.out.println(BillCalculator.calculateBill(bill, payOfServices, packagingFee));
    }
}
