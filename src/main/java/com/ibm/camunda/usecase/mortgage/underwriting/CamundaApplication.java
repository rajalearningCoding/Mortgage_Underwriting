package com.ibm.camunda.usecase.mortgage.underwriting;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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