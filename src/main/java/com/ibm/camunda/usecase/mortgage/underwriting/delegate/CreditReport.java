package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;



@Component("creditReport")
public class CreditReport implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception
    {

        /*String borrowerName=(String) execution.getVariable("Name");
        long income=(long) execution.getVariable("income");

        long creditScore=checkCreditScore(borrowerName,income);

        execution.setVariable("creditScore", creditScore);*/

        System.out.println("Third Party System called for sending credit details");



    }

   /* private int checkCreditScore(String borrowerName, long income) {
        // TODO Auto-generated method stub
        if(income>1500000)
        {
            return 700;
        }
        else
        {
            return 500;
        }

    }*/
}