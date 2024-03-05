package com.ibm.camunda.usecase.mortgage.underwriting.Controllers;

import com.ibm.camunda.usecase.mortgage.underwriting.Services.BorrowerServices;
import com.ibm.camunda.usecase.mortgage.underwriting.delegate.LoggerDelegate;
import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class BorrowerControllers {
    private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

    /*@RestController
    //@RequestMapping("/user")
    public class UserController {
        @Autowired
        private BorrowerServices borrowerService;


        // Creating User
        @PostMapping("/create-Borrower")
        public Borrower createUser(@RequestBody Borrower borrower ) throws Exception {
            return this.borrowerService.createBorrower(borrower);

        }

        @GetMapping("/hello")
        public String sayHello(){
            LOGGER.info("\n\n changed by raja for git trial 1");

            return "hello";

        }



    }*/
}
