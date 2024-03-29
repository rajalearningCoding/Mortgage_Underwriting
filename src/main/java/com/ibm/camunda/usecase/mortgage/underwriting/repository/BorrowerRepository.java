package com.ibm.camunda.usecase.mortgage.underwriting.repository;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BorrowerRepository extends JpaRepository<Borrower,Integer> {
    public Borrower findByPanNo(String panNo);
}
