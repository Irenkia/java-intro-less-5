package org.example;

public class BillCalculator {
    public static double calculateBill(double bill, float payOfServices){
        return roundResult(bill + payServices(bill, payOfServices));
    }

    public static double calculateBill(double bill, float payOfServices, double discount){
        return roundResult((bill - calculateDiscount(bill, discount)) + payServices(bill, payOfServices));
    }
    public static double calculateBill(double bill, float payOfServices, short packagingFee){
        return roundResult(bill + payServices(bill, payOfServices) + (double)packagingFee);
    }

    private static double payServices(double bill, float payOfServices){
        return (payOfServices / 100) * bill;
    }

    private static double calculateDiscount(double bill, double discount){return (discount / 100) * bill;}
    private static double roundResult(double result){
        return Math.round(result * 100.0) / 100.0;
    }
}
