package com.ibm.camunda.usecase.mortgage.underwriting.controllers;

import java.util.logging.Logger;

import com.ibm.camunda.usecase.mortgage.underwriting.delegate.LoggerDelegate;

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
