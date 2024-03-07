/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author LIYAJERARD
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Borrower")
public class Borrower {
	    @Id
	   // @GeneratedValue(strategy = GenerationType.AUTO)

	    public Integer caseNo;
	    public String borrowerType;
	    public String name;
	    public Date dob;
	    public String panNo;
		public String country;
		public String state;
		public String city;
		public long pin;
		public String address1;
		public String address2;
		public long phoneNumber;
		public String email;
		public String empStab;
		public String payHist;
		public long dti;
		public long ltv;
		public long creditScore;
		public String credReport;
		public String employerName;
		public Date empStart;
		public Date empEnd;
		public long income;
		public String assets;
		public String liabilities;
		public long debt;
		public long loanAmount;
		public String loanTerm;
		public long intRate;
		public String loanPurp;
		public long dpAmount;
		public String loanPrg;
		public String propAddress;
		public String propType;
		public long propValue;
		public long propArea;
		public long nBed;
		public long nBath;
		public long lotSize;	

}
