/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.listener;

import java.util.concurrent.atomic.AtomicInteger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

/**
 * @author LIYAJERARD
 *
 */
@Component("applicationListener")
public class ApplicationListener implements ExecutionListener{

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		AtomicInteger seq = new AtomicInteger();
		int nextVal = seq.incrementAndGet();
		String caseNo = String.valueOf(nextVal);
		execution.setProcessBusinessKey(caseNo);

		
	}

}
