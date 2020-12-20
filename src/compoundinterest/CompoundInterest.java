/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

/**
 *
 * @author Shanell A Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 2
 * Date:  09/26/2020
 * 
 * Description:  This assignment is to complete programming challenges in the
 * Chapter #2 book of "Starting with JAVA, From Control Structures through Objects".
 * ISBN-13 # 978-0-13-480221-3. This program is Programming Challenge # 21: Compound Interest. 
 * We are to calculate the amount of money accrued in an account over a specified number of years. 
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t ♥ Chapter 2 - Programming Challenge #21: Compound Interest ♥ \n");
        
        Calculate calc = new Calculate();
        calc.userInput();
        calc.calculateAccruedBalance();
    }
    
}
