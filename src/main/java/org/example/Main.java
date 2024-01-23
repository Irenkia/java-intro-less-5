package org.example;

public class Main {
    public static void main(String[] args) {
        forBillCalculator();
    }
    public static void forBillCalculator() {
        BillCalculator bill = new BillCalculator(200.0, 0.3f, 1.5, (short) 5);
        System.out.println("\nOur bill = " + bill.getBill());
        System.out.print("\nWith service fee (0.3%) : 200 + 0.60 = ");
        System.out.print(bill.calculateBill(bill.getBill(), bill.getPayOfServices()));
        System.out.println("\n\nWith service fee (0.3%) and minus discount (1.5%) ");
        System.out.println("the discount applies only to the invoice amount and not to the service fee :");
        System.out.print("(200 - 3) + 0.60 = ");
        System.out.println(bill.calculateBill(bill.getBill(), bill.getPayOfServices(), bill.getDiscount()));
        System.out.print("\n\nWith service fee (0.3%) and takeaway packaging fee (fix price = 5) : 200 + 0.60 + 5 = ");
        System.out.println(bill.calculateBill(bill.getBill(), bill.getPayOfServices(), bill.getPackagingFee()));
    }
}
