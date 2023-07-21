package com.openlending.credit;

public enum CreditBureau {
  EXPERIAN(700),
  EQUIFAX(600),
  TRANSUNION(500);

  int CreditScore;

  CreditBureau (int CreditScore){
    this.CreditScore = CreditScore;
  }
}
