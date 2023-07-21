package com.openlending.credit;
/**
 * Factory to generate an implementation of CreditScoreService
 */
public class CreditScoreServiceFactory {

    public static CreditScoreService getCreditB(String CreditBureau){
       if(CreditBureau.equalsIgnoreCase("TRANSUNION")){
           return new TransUnion();
       }
       else if (CreditBureau.equalsIgnoreCase("Equifax")){
           return new EquifaxService();
       }
       else if(CreditBureau.equalsIgnoreCase("Experian")){
           return new ExperianService();
       }
       return null;
    }

}