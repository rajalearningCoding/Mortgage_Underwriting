/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.def.services.repository;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {

    public Borrower findByPanNo(String panNo);


}


