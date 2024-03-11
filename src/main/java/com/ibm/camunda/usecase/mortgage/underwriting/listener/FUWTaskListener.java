/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.listener;

import java.util.Date;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.service.SaveBorrowerService;
import com.ibm.camunda.usecase.mortgage.underwriting.service.SaveBorrowerServiceImpl;

/**
 * @author LIYAJERARD
 *
 */
@Component("fUWTak")
public class FUWTaskListener implements TaskListener {
	
	@Autowired
	SaveBorrowerService sb;
	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		Borrower b = new Borrower();
		String uw1Name,uw1Action,uw1Comment,panNo;
		Date uw1ActionDate;
		uw1Name =delegateTask.getAssignee();
		delegateTask.setVariable("uw1Name", uw1Name);
		System.out.println(delegateTask.getVariable("uw1Name"));
		b.setUw1Name(uw1Name);
		if(delegateTask.getVariable("decision")!= null && delegateTask.getVariable("decision")!="") {

			uw1Action = (String) delegateTask.getVariable("decision");
			delegateTask.setVariable("uw1Action", uw1Action);
			b.setUw1Action(uw1Action);
			System.out.println("action:"+delegateTask.getVariable("uw1Name"));
		}
		if(delegateTask.getVariable("note")!= null && delegateTask.getVariable("note")!="") {
			uw1Comment = (String) delegateTask.getVariable("note");
			delegateTask.setVariable("uw1Comment", uw1Comment);
			b.setUw1Comment(uw1Comment);
			System.out.println("b.note:"+b.getUw1Comment());
			System.out.println("note:"+delegateTask.getVariable("uw1Comment"));			
		}
		uw1ActionDate = new Date();
		b.setUw1ActionDate(uw1ActionDate);
		delegateTask.setVariable("uw1ActionDate", new Date());
		System.out.println(delegateTask.getVariable("uw1ActionDate"));
		if(delegateTask.getVariable("panNo")!=null && delegateTask.getVariable("panNo")!="") {
			panNo = (String)delegateTask.getVariable("panNo");
			b.setPanNo(panNo);
		}
		
		this.sb.saveUWAction(b, "saveUW1");
		System.out.println("uW1 Details saved");

	}
	

}
