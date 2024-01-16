package org.example;

public class BillCalculator {
    private double invoiceAmount;
    private float accountServiceFee = 0.3f;
    private double discount = 1.5;
    private short packagingFee = 5;

    public BillCalculator() {
    }

    public BillCalculator(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public float getAccountServiceFee() {
        return accountServiceFee;
    }

    public void setAccountServiceFee(float accountServiceFee) {
        this.accountServiceFee = accountServiceFee;
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

    public double calculateInvoiceAmount(double invoiceAmount, float accountServiceFee){
        double resultAccountServiceFee = ((double) accountServiceFee / 100) * invoiceAmount;
        double resultCalculate = invoiceAmount + resultAccountServiceFee;
        double roundedResult = Math.round(resultCalculate * 100.0) / 100.0;
        return roundedResult;
    }

    public double calculateInvoiceAmount(double invoiceAmount, float accountServiceFee, double discount){
        double resultAccountServiceFee = ((double)accountServiceFee / 100) * invoiceAmount;
        double resultDiscount = (discount / 100) * invoiceAmount;
        double resultCalculate = (invoiceAmount - resultDiscount) + resultAccountServiceFee;
        double roundedResult = Math.round(resultCalculate * 100.0) / 100.0;
        return roundedResult;
    }
    public double calculateInvoiceAmount(double invoiceAmount, float accountServiceFee, short packagingFee){
        double resultAccountServiceFee = (accountServiceFee / 100) * invoiceAmount;
        double resultCalculate = invoiceAmount + resultAccountServiceFee + (double)packagingFee;
        double roundedResult = Math.round(resultCalculate * 100.0) / 100.0;
        return roundedResult;
    }
}
