package com.ibm.camunda.usecase.mortgage.underwriting.def.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.def.services.*;
import com.ibm.camunda.usecase.mortgage.underwriting.def.services.repository.BorrowerRepository;


@Service
@Component()

public class BorrowerServiceImpl  implements BorrowerServices{

    @Autowired
    public  BorrowerRepository borrowerRepository;

    @Override
    @Bean
    public Borrower createBorrower(Borrower borrower) throws Exception {
        Borrower local = this.borrowerRepository.findByPanNo(borrower.getPanNo());

        if (local != null) {
            System.out.println("User already Exist ");
            throw new Exception("User already Present");

        }
        return local;
    }

    @Override
    public Borrower getBorrower(String panNo) {
        return null;
    }


}

