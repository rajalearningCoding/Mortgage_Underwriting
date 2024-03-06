package com.ibm.camunda.usecase.mortgage.underwriting.def.services;

import com.ibm.camunda.usecase.mortgage.underwriting.model.*;

import java.util.Set;

public interface BorrowerServices {

    public Borrower createBorrower(Borrower borrower) throws Exception;

    // find user or get user by name
    public Borrower getBorrower(String panNo);
}
