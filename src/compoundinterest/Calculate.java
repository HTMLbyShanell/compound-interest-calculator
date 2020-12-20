/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 */
public class Calculate {
    double accruedAmount;
    double originalPrincipal;
    double annualInterestRate;
    double calculation; //makes it easier for me to separate the exponential portion of math
    int timesInterestCompoundedAnnually;
    int yearsAccountIsOpen;
    int exponent;
    
    Scanner keyboard = new Scanner(System.in);
    
    public void userInput()
    {
        System.out.println("What is Original Principal Amount?");
        originalPrincipal = keyboard.nextDouble();
        System.out.println("What is the Annual Interest Rate, decimal format?");
        annualInterestRate = keyboard.nextDouble();
        System.out.println("How many times per year is interest compounded?");
        timesInterestCompoundedAnnually = keyboard.nextInt();
        System.out.println("How many years will you keep the account open?");
        yearsAccountIsOpen = keyboard.nextInt();
    }
    
    public void calculateAccruedBalance()
    {
        calculation = 1 + (annualInterestRate / timesInterestCompoundedAnnually);
        exponent = (timesInterestCompoundedAnnually * yearsAccountIsOpen);
        accruedAmount = originalPrincipal * Math.pow(calculation, exponent);
        
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("Your Balance in " + yearsAccountIsOpen 
                + " Years Will Be:   $" + df.format(accruedAmount));
    }
}