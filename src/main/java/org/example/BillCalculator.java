package org.example;

public class BillCalculator {
    private  double bill;
    private  float payOfServices;
    private double discount;
    private short packagingFee;

    public BillCalculator() {
    }

    public BillCalculator(double bill) {
        this.bill = bill;
    }

    public BillCalculator(double bill, float payOfServices, double discount, short packagingFee) {
        this.bill = bill;
        this.payOfServices = payOfServices;
        this.discount = discount;
        this.packagingFee = packagingFee;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public float getPayOfServices() {
        return payOfServices;
    }

    public void setPayOfServices(float payOfServices) {
        this.payOfServices = payOfServices;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public short getPackagingFee() {
        return packagingFee;
    }

    public void setPackagingFee(short packagingFee) {
        this.packagingFee = packagingFee;
    }

    public double calculateBill(double bill, float payOfServices){
        double resultPayOfServices = (payOfServices / 100) * bill;
        double resultCalculate = bill + resultPayOfServices;
        double roundedResult = roundResult(resultCalculate);
        return roundedResult;
    }

    public double calculateBill(double bill, float payOfServices, double discount){
        double resultPayOfServices = (payOfServices / 100) * bill;
        double resultDiscount = (discount / 100) * bill;
        double resultCalculate = (bill - resultDiscount) + resultPayOfServices;
        double roundedResult = roundResult(resultCalculate);
        return roundedResult;
    }
    public double calculateBill(double bill, float payOfServices, short packagingFee){
        double resultPayOfServices = (payOfServices / 100) * bill;
        double resultCalculate = bill + resultPayOfServices + (double)packagingFee;
        double roundedResult = roundResult(resultCalculate);
        return roundedResult;
    }

    public  double roundResult(double result){
        return Math.round(result * 100.0) / 100.0;
    }
}
