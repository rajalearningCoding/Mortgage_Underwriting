package com.ibm.camunda.usecase.mortgage.underwriting.def.services;

import com.ibm.camunda.usecase.mortgage.underwriting.def.services.repository.BorrowerRepository;
//import com.ibm.camunda.usecase.mortgage.underwriting.Services.Implementation.BorrowerServiceImpl;
import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.model.ContactInfo;
import com.ibm.camunda.usecase.mortgage.underwriting.model.CreditHistory;
import com.ibm.camunda.usecase.mortgage.underwriting.model.EmpHistory;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashSet;
import java.util.Set;

@EnableJpaRepositories

@SpringBootApplication
@ComponentScan("com.*")
//@EnableProcessApplication("Mortgage_Underwriting")
public class CamundaApplication  implements CommandLineRunner {
  //@Autowired
  /*@Autowired(required=true)
  private BorrowerServices borrowerServices;*/

  public static void main(String... args) throws Exception {

    SpringApplication.run(CamundaApplication.class, args);
  }
  @Override

  public void run(String... args) throws Exception {
    Borrower user1 = new Borrower();
    user1.setBorrowerType("test");
    user1.setCaseNo(12);
    user1.setName("Raja");
    user1.setPanNo("ASWPR");

    //Borrower userout1 = this.borrowerServices.createBorrower(user1);
    //System.out.println(userout1);
/*

  ContactInfo contactInfo = new ContactInfo();
    contactInfo.setEmail("TEst@gmail.com");
  user1.setContDetails(contactInfo);
  *//*Set<ContactInfo> contactInfos = new HashSet<>();
    contactInfos.add(contactInfo);
    user1.setContactInfos(contactInfos);*//*

  CreditHistory creditHistory = new CreditHistory();
    creditHistory.setCredReport("333");//setEmail("TEst@gmail.com");
    creditHistory.setCredScore(333L);
  user1.setCredDet(creditHistory);
*//*  Set<CreditHistory> creditHistorySet = new HashSet<>();
    creditHistorySet.add(creditHistory);
    user1.setCreditHistories(creditHistorySet);*//*

  EmpHistory empHistory = new EmpHistory();
    empHistory.setIncome(4444L);//setEmail("TEst@gmail.com");
  //empHistory.setCredScore(333L);
  user1.setEmpHist(empHistory);
  *//*Set<EmpHistory> empHistorySet = new HashSet<>();
    empHistorySet.add(empHistory);
    user1.setEmpHistories(empHistorySet);*//*

  Borrower userout1 = this.borrowerServices.createBorrower(user1);

    System.out.println(userout1);*/

}


}
