package com.company;

public class Main {

    public static void main(String[] args) {
    Stock stoc = new Stock("S","Actiune",10,12.25);
    double change = stoc.getChangePercent();
        System.out.println("Pretul a crescut/scazut cu " + change + " %.");
    }
}
