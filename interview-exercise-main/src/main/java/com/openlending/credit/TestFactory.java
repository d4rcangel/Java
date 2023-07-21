package com.openlending.credit;

public class TestFactory {
    public static void main(String[] args) {
        CreditScoreService CreditBureau1 = CreditScoreServiceFactory.getCreditB("Experian");
        CreditScoreService CreditBureau2 = CreditScoreServiceFactory.getCreditB("Transunion");
        CreditScoreService CreditBureau3 = CreditScoreServiceFactory.getCreditB("Equifax");
        System.out.println(CreditBureau1.getCreditBureauName() + " " + CreditBureau1.getCreditScore());
        System.out.println(CreditBureau2.getCreditBureauName() + " " + CreditBureau2.getCreditScore());
        System.out.println(CreditBureau3.getCreditBureauName() + " " + CreditBureau3.getCreditScore());
        System.out.println((Math.max(CreditBureau3.getCreditScore(), Math.max(CreditBureau1.getCreditScore(), CreditBureau2.getCreditScore()))));
    CreditScoreService E = new EquifaxService();

    }

}

