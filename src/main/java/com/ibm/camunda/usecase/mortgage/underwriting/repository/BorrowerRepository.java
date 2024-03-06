package com.ibm.camunda.usecase.mortgage.underwriting.repository;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower,Integer> {
    public Borrower findByPanNo(String panNo);
}
