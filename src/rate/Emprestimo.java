/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rate;

/**
 *
 * @author lpiedade
 */
public class Emprestimo {
    private Integer yearsLoan;
    private Integer paymentLoan;
    private Integer entryValue;
    private Integer rate;

    public Emprestimo(Integer yearsLoan, Integer paymentLoan, Integer entryValue) {
        this.yearsLoan = yearsLoan;
        this.paymentLoan = paymentLoan;
        this.entryValue = entryValue;
        this.rate=5;
    }

    public Integer getYearsLoan() {
        return yearsLoan;
    }

    public void setYearsLoan(Integer yearsLoan) {
        this.yearsLoan = yearsLoan;
    }

    public Integer getPaymentLoan() {
        return paymentLoan;
    }

    public void setPaymentLoan(Integer paymentLoan) {
        this.paymentLoan = paymentLoan;
    }

    public Integer getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Integer entryValue) {
        this.entryValue = entryValue;
    }
    
    // helper metoth to calculate months 
    private Integer howManyMonths(){

        return this.yearsLoan * 12;
    }
    //Calculation the Payment that we need to perform every month
    public Integer monthlyPayment(){
        Integer months=this.howManyMonths();
        Integer remain= this.paymentLoan - this.entryValue;
        Integer remainsAfter =remain +((remain*this.rate)/100);
        
        
        return remainsAfter/months;
    }
    // add years to the loan
    public void addYearsToPayment(Integer moreYears){
        this.yearsLoan=this.yearsLoan + moreYears;
    }
    //Ligia
    
}
