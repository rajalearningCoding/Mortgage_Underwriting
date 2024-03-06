package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("checkDuplicateCase")
public class CheckDuplicateCase implements JavaDelegate {
    @Autowired
    private BorrowerRepository borrowerRepository;
    private final Logger LOGGER = Logger.getLogger(CheckDuplicateCase.class.getName());

    public void execute(DelegateExecution execution) throws Exception {

        // We check if duplicate case is present or no
        System.out.println("Test");
        String panNo = (String) execution.getVariable("panNo");
        Borrower user = (Borrower) execution.getVariable("Borrower");
        Borrower userout1 = this.borrowerRepository.findByPanNo(panNo);
        System.out.println(userout1);
        if(userout1!=null)
        {
            System.out.println("User already Exist ");
            System.out.println("Data Retirved from DB - "+userout1.getName());
            throw new BpmnError("UE-001", "User already Exist");
            // throw  new Exception("User already Present");
        }else {
            this.borrowerRepository.save(user);
            //this.borrowerRepository.

        }




        LOGGER.info("User duplicate User no- "+panNo);

    }

}
