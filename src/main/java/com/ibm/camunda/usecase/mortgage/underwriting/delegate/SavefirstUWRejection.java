package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("savefirstUWRejection")
public class SavefirstUWRejection implements JavaDelegate {
    @Autowired
    private BorrowerRepository borrowerRepository;

    private final Logger LOGGER = Logger.getLogger(SavefirstUWRejection.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {

        System.out.println("SavefirstUWRejection  ");
        var panNo = (String) execution.getVariable("panNo");
        Borrower user = this.borrowerRepository.findByPanNo(panNo);

        var uw1Name = (String) execution.getVariable("uw1Name");
        var uw1Action = (String) execution.getVariable("uw1Action");
        var uw1Comment = (String)execution.getVariable("uw1Comment");
        user.setUw1Name(uw1Name);
        user.setUw1Action(uw1Action);
        user.setUw1Comment(uw1Comment);
        user.setCaseStatus("First Underwritter rejected");
        this.borrowerRepository.save(user);



    }
}
