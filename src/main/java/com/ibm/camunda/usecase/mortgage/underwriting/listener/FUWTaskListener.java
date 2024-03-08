/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.listener;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

/**
 * @author LIYAJERARD
 *
 */
public class FUWTaskListener implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		delegateTask.setVariable("taskCompletedBy", delegateTask.getAssignee());
		System.out.println(delegateTask.getVariable("taskCompletedBy"));
		
	}
	

}
