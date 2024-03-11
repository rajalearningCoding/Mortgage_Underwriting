package com.ibm.camunda.usecase.mortgage.underwriting;


import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CamundaApplication  implements CommandLineRunner {
    /*@Autowired
    private BorrowerRepository borrowerRepository;*/


    public static void main(String... args) throws Exception {

        SpringApplication.run(CamundaApplication.class, args);
    }

    @Override

    public void run(String... args) throws Exception {
      



    	

    }
}