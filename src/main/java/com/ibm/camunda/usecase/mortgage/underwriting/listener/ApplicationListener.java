/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;

/**
 * @author LIYAJERARD
 *
 */
@Component("applicationListener")
public class ApplicationListener implements ExecutionListener{
    @Autowired
    private BorrowerRepository borrowerRepository;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		List<Borrower> brList = new ArrayList<Borrower>();
		brList = this.borrowerRepository.findAll(Sort.by(Sort.Direction.DESC, "caseNo"));
		int nextVal = 0;
		System.out.println("nextVal:"+nextVal);
		if(brList != null && !brList.isEmpty())
			nextVal = brList.get(0).getCaseNo();
		System.out.println("nextVal:"+nextVal);
		nextVal = nextVal+1;
		String caseNo = String.valueOf(nextVal);
		execution.setProcessBusinessKey(caseNo);

		
	}

}
