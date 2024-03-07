/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.service.SaveBorrowerService;

/**
 * @author LIYAJERARD
 *
 */
@Component("saveBorrower")
public class SaveBorrowerDelegate implements JavaDelegate{
	private final Logger LOGGER = Logger.getLogger(SaveBorrowerDelegate.class.getName());
	@Autowired
	SaveBorrowerService sb;
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Borrower b = new Borrower();

		String borrowerType="O";
		String name ;
		String panNo ;
		Integer caseNo = Integer.parseInt(execution.getBusinessKey());
		Date dob ;
		String country;
		String state ;
		String city;
		long pin ;
		String address1;
		String address2 ;
		long phoneNumber ;
		String email ;
		String empStab ;
		String payHist ;
		long dti;
		long ltv;
		long creditScore;
		String credReport;
		String employerName;
		Date empStart;
		Date empEnd;
		long income;
		String assets;
		String liabilities;
		long debt;
		long loanAmount;
		String loanTerm;
		long intRate;
		String loanPurp;
		long dpAmount;
		String loanPrg;
		String propAddress;
		String propType;
		long propValue;
		long propArea;
		long nBed;
		long nBath;
		long lotSize;			
		String dobString;
		String empStartString;
		String empEndString;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		System.out.println("delegate called");
		if(execution.getVariable("dob")!= null && execution.getVariable("dob")!= "") {
			dobString =(String) execution.getVariable("dob");
			dob = formatter.parse(dobString);
			b.setDob(dob);
		}
		System.out.println("EmpStart:"+execution.getVariable("empStart"));
		if(execution.getVariable("empStart")!= null && execution.getVariable("empStart")!="" ) {
			System.out.println("EmpStart:"+execution.getVariable("empStart"));
			empStartString =(String) execution.getVariable("empStart");
			empStart = formatter.parse(empStartString);
			b.setEmpStart(empStart);
		}
		if(execution.getVariable("empEnd")!= null && execution.getVariable("empEnd")!="" ) {
			empEndString =(String) execution.getVariable("empEnd");
			empEnd = formatter.parse(empEndString);
			b.setEmpEnd(empEnd);
		}
		
		if(execution.getVariable("name") != null) {
			name=(String) execution.getVariable("name");
			System.out.println("name:"+name);
			b.setName(name);
		}
		if(execution.getVariable("panNo") != null) {
			panNo=(String) execution.getVariable("panNo");
			System.out.println("panNo:"+panNo);
			b.setPanNo(panNo);
		}
		if(execution.getVariable("country") != null) {
			country=(String) execution.getVariable("country");
			System.out.println("country:"+country);
			b.setCountry(country);
		}
		if(execution.getVariable("state") != null) {
			state=(String) execution.getVariable("state");
			System.out.println("state"+state);
			b.setState(state);
		}
		if(execution.getVariable("city") != null) {
			city=(String) execution.getVariable("city");
			System.out.println("city:"+city);
			b.setCity(city);
		}
		if(execution.getVariable("address1") != null) {
			address1=(String) execution.getVariable("address1");
			b.setAddress1(address1);
			System.out.println("address1:"+address1);
			b.setAddress1(address1);
		}
		if(execution.getVariable("address2") != null) {
			address2=(String) execution.getVariable("address2");
			LOGGER.info("address2:"+address2);
			b.setAddress2(address2);
		}
		if(execution.getVariable("email") != null) {
			email=(String) execution.getVariable("email");
			System.out.println("email:"+email);
			b.setEmail(email);
		}
		if(execution.getVariable("empStab") != null) {
			empStab=(String) execution.getVariable("empStab");
			System.out.println("empStab:"+empStab);
			b.setEmpStab(empStab);
		}
		if(execution.getVariable("payHist") != null) {
			payHist=(String) execution.getVariable("payHist");
			System.out.println("payHist:"+payHist);
			b.setPayHist(payHist);
		}
		if(execution.getVariable("credReport") != null) {
			credReport=(String) execution.getVariable("credReport");
			System.out.println("credReport:"+credReport);
			b.setCredReport(credReport);
		}
		if(execution.getVariable("employerName") != null) {
			employerName=(String) execution.getVariable("employerName");
			System.out.println("employerName:"+employerName);
			b.setEmployerName(employerName);
		}
		if(execution.getVariable("assets") != null) {
			assets=(String) execution.getVariable("assets");
			System.out.println("assets:"+assets);
			b.setAssets(assets);
		}
		if(execution.getVariable("liabilities") != null) {
			liabilities=(String) execution.getVariable("liabilities");
			System.out.println("liabilities:"+liabilities);
			b.setLiabilities(liabilities);
		}
		if(execution.getVariable("loanTerm") != null) {
			loanTerm=(String) execution.getVariable("loanTerm");
			System.out.println("loanTerm:"+loanTerm);
			b.setLoanTerm(loanTerm);
		}
		if(execution.getVariable("loanPurp") != null) {
			loanPurp=(String) execution.getVariable("loanPurp");
			System.out.println("loanPurp:"+loanPurp);
			b.setLoanPurp(loanPurp);
		}
		if(execution.getVariable("loanPrg") != null) {
			loanPrg=(String) execution.getVariable("loanPrg");
			System.out.println("loanPrg:"+loanPrg);
			b.setLoanPrg(loanPrg);
		}
		if(execution.getVariable("propAddress") != null) {
			propAddress=(String) execution.getVariable("propAddress");
			System.out.println("propAddress:"+propAddress);
			b.setPropAddress(propAddress);
		}
		if(execution.getVariable("propType") != null) {
			propType=(String) execution.getVariable("propType");
			System.out.println("propType:"+propType);
			b.setPropType(propType);
		}
		
		if(execution.getVariable("pin") != null  && execution.getVariable("pin")!="") {
			pin=(Long) execution.getVariable("pin");
			System.out.println("pin:"+pin);
			b.setPin(pin);
		}
		if(execution.getVariable("phoneNumber") != null && execution.getVariable("phoneNumber") !="") {
			phoneNumber=(Long) execution.getVariable("phoneNumber");
			System.out.println("phoneNumber:"+phoneNumber);
			b.setPhoneNumber(phoneNumber);
		}
		if(execution.getVariable("dti") != null && execution.getVariable("dti")!="") {
			dti=(Long) execution.getVariable("dti");
			System.out.println("dti:"+dti);
			b.setDti(dti);
		}
		if(execution.getVariable("ltv") != null && execution.getVariable("ltv")!="") {
			ltv=(Long) execution.getVariable("ltv");
			System.out.println("ltv:"+ltv);
			b.setLtv(ltv);
		}
		if(execution.getVariable("creditScore") != null && execution.getVariable("creditScore") !="") {
			creditScore=(Long) execution.getVariable("creditScore");
			System.out.println("creditScore:"+creditScore);
			b.setCreditScore(creditScore);
		}
		if(execution.getVariable("income") != null && execution.getVariable("income") != "") {
			income=(Long) execution.getVariable("income");
			System.out.println("income:"+income);
			b.setIncome(income);
		}
		if(execution.getVariable("debt") != null && execution.getVariable("debt") !="") {
			debt=(Long) execution.getVariable("debt");
			System.out.println("debt:"+debt);
			b.setDebt(debt);
		}
		if(execution.getVariable("loanAmount") != null && execution.getVariable("loanAmount")!="") {
			loanAmount=(Long) execution.getVariable("loanAmount");
			System.out.println("loanAmount:"+loanAmount);
			b.setLoanAmount(loanAmount);
		}
		if(execution.getVariable("intRate") != null && execution.getVariable("intRate") != "") {
			intRate=(Long) execution.getVariable("intRate");
			System.out.println("intRate:"+intRate);
			b.setIntRate(intRate);
		}
		if(execution.getVariable("dpAmount") != null && execution.getVariable("dpAmount") !="") {
			dpAmount=(Long) execution.getVariable("dpAmount");
			System.out.println("dpAmount:"+dpAmount);
			b.setDpAmount(dpAmount);
		}
		if(execution.getVariable("propValue") != null && execution.getVariable("propValue") != "") {
			propValue=(Long) execution.getVariable("propValue");
			System.out.println("propValue:"+propValue);
			b.setPropValue(propValue);
		}
		if(execution.getVariable("propArea") != null && execution.getVariable("propValue") != "") {
			propArea=(Long) execution.getVariable("propArea");
			System.out.println("propArea:"+propArea);
			b.setPropArea(propArea);
		}
		if(execution.getVariable("nBed") != null && execution.getVariable("nBed") != "") {
			nBed=(Long) execution.getVariable("nBed");
			System.out.println("nBed:"+nBed);
			b.setNBed(nBed);
		}
		if(execution.getVariable("nBath") != null && execution.getVariable("nBath") != "") {
			nBath=(Long) execution.getVariable("nBath");
			System.out.println("nBath:"+nBath);
			b.setNBath(nBath);
		}
		if(execution.getVariable("lotSize") != null && execution.getVariable("lotSize") != "") {
			lotSize=(Long) execution.getVariable("lotSize");
			System.out.println("lotSize:"+lotSize);
			b.setLotSize(lotSize);
		}
		b.setBorrowerType(borrowerType);
		b.setCaseNo(caseNo);
		//this.borrowerRepository.save(b);
		
		this.sb.saveBorrower(b);
		
	}

}
