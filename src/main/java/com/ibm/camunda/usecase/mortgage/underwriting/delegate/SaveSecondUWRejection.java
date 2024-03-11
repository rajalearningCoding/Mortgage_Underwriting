package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("saveSecondUWRejection")
public class SaveSecondUWRejection implements JavaDelegate {
    @Autowired
    private BorrowerRepository borrowerRepository;

    private final Logger LOGGER = Logger.getLogger(SaveSecondUWRejection.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {

        System.out.println("SaveSecondUWRejection  ");
        var panNo = (String) execution.getVariable("panNo");
        Borrower user = this.borrowerRepository.findByPanNo(panNo);

        var uw2Name = (String) execution.getVariable("uw2Name");
        var uw2Action = (String) execution.getVariable("uw2Action");
        var uw2Comment = (String)execution.getVariable("uw2Comment");
        user.setUw1Name(uw2Name);
        user.setUw1Action(uw2Action);
        user.setUw1Comment(uw2Comment);
        user.setCaseStatus("Second Underwritter rejected");
        this.borrowerRepository.save(user);



    }
}
