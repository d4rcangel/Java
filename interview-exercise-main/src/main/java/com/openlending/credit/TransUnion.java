package com.openlending.credit;

public class TransUnion implements CreditScoreService{

    @Override
    public CreditBureau getCreditBureauName() {
        return CreditBureau.TRANSUNION;
    }

    @Override
    public int getCreditScore() {
        return 500;}

}