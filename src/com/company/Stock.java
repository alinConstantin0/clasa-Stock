package com.company;

public class Stock {
    private String simbol;
    private String stoc;
    private double closingPrice = 0;
    private double currentPrice = 0;

    public Stock(String simbol, String nume, double clPr, double crPr) {
        this.simbol = simbol;
        this.stoc = nume;
        this.closingPrice = clPr;
        this.currentPrice = crPr;
    }

    public double getChangePercent() {
        double change = 0;
        if (this.closingPrice>this.currentPrice) {
            change = ((this.closingPrice - this.currentPrice)/this.closingPrice) * 100;
        }
        if (this.closingPrice<this.currentPrice) {
            change = ((this.currentPrice - this.closingPrice)/this.closingPrice) * 100;
        }
        return change;
    }
}
