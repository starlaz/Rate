/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rate;
//Teste Git
/**
 *
 * @author lpiedade
 */
public class Rate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Emprestimo emprestimo = new Emprestimo(2, 10000, 1000);
   
        
        System.out.println("Value requested:" + emprestimo.getPaymentLoan()+ " Euros");
        System.out.println("Value of entry:" +  emprestimo.getEntryValue()+ " Euros");
        System.out.println("Years to pay: " + emprestimo.getYearsLoan() + " Euros");
        System.out.println("The monthly payment is:"+ emprestimo.monthlyPayment()+ " Euros");
    }
    
}
