package com.ibm.camunda.usecase.mortgage.underwriting;


import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EnableProcessApplication("Mortgage_Underwriting")
public class CamundaApplication  implements CommandLineRunner {
    @Autowired
    //private BorrowerRepository borrowerRepository;


    public static void main(String... args) throws Exception {

        SpringApplication.run(CamundaApplication.class, args);
    }

    @Override

    public void run(String... args) throws Exception {
      Borrower user1 = new Borrower();
        user1.setBorrowerType("test");
        user1.setCaseNo(12);
        user1.setName("test");
        user1.setPanNo("ASWPR2");

        //Borrower userout1 = this.borrowerRepo.findByPanNo(user1.getPanNo());
        System.out.println("Test");
       /*Borrower userout1 = this.borrowerRepository.findByPanNo(user1.getPanNo());
        if(userout1!=null)
        {
            System.out.println("User already Exist ");
            throw  new Exception("User already Present");
        }else {
                this.borrowerRepository.save(user1);

        }*/




    }
}