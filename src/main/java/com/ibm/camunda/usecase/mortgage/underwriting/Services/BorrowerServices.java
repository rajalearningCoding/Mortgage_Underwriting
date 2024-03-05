package com.ibm.camunda.usecase.mortgage.underwriting.Services;

import com.ibm.camunda.usecase.mortgage.underwriting.model.*;

import java.util.Set;

public interface BorrowerServices {

    public Borrower createBorrower(Borrower borrower) throws Exception;
}
