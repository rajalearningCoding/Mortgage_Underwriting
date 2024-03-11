/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.listener;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.task.IdentityLink;
import org.camunda.bpm.engine.task.IdentityLinkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.camunda.usecase.mortgage.underwriting.delegate.SaveBorrowerDelegate;
import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.service.SaveBorrowerServiceImpl;

/**
 * @author LIYAJERARD
 *
 */
@Component("sUWTak")
public class SUWTaskListener implements TaskListener{
	private final Logger log = Logger.getLogger(SUWTaskListener.class.getName());
	@Autowired
	SaveBorrowerServiceImpl sb;
	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		  /*Set<String> candidateUsersList = new HashSet<String>();
	      log.info("Update CandidateUser for task:{}, name:{}"+ delegateTask.getId());
	      Set<IdentityLink> identityLinks = delegateTask.getCandidates();
	      if (!identityLinks.isEmpty()) {
	        identityLinks.stream().filter(identityLink -> IdentityLinkType.CANDIDATE.equals(identityLink.getType())
	            && identityLink.getUserId() != null).forEach(identityLink -> {
	              log.info("Task " + delegateTask.getId() + " has an identity link for a user with id: "
	                  + identityLink.getUserId());
	              candidateUsersList.add(identityLink.getUserId());
	              delegateTask.deleteUserIdentityLink(identityLink.getUserId(), IdentityLinkType.CANDIDATE);
	            });
	      }
	      for(String user: candidateUsersList) {
	    	  if(user.equalsIgnoreCase((String) delegateTask.getVariable("taskCompletedBy"))) {
	    		  candidateUsersList.remove(user);
	    		  System.out.println("user removed"+user);
	    	  }
	      }
	      delegateTask.addCandidateUsers(candidateUsersList);
	      System.out.println("user added"+candidateUsersList);*/
		Borrower b = new Borrower();
		String uw2Name,uw2Action,uw2Comment,panNo;
		Date uw2ActionDate;
		uw2Name = delegateTask.getAssignee();
		delegateTask.setVariable("uw2Name",uw2Name );
		b.setUw2Name(uw2Name);
		System.out.println(delegateTask.getVariable("uw2Name"));
		if(delegateTask.getVariable("decision")!= null && delegateTask.getVariable("decision")!="") {
			uw2Action = (String) delegateTask.getVariable("decision");
			delegateTask.setVariable("uw2Action", uw2Action);
			b.setUw2Action(uw2Action);
			System.out.println("action:"+delegateTask.getVariable("uw2Name"));
		}
		if(delegateTask.getVariable("note")!= null && delegateTask.getVariable("note")!="") {
			uw2Comment = (String) delegateTask.getVariable("note");
			delegateTask.setVariable("uw2Comment", uw2Comment);
			b.setUw2Comment(uw2Comment);
			System.out.println("b.note:"+b.getUw2Comment());
			System.out.println("note:"+delegateTask.getVariable("uw2Comment"));			
		}
		uw2ActionDate= new Date();
		b.setUw2ActionDate(uw2ActionDate);
		
		delegateTask.setVariable("uw2ActionDate", new Date());		
		if(delegateTask.getVariable("panNo")!=null && delegateTask.getVariable("panNo")!="") {
			panNo = (String)delegateTask.getVariable("panNo");
			b.setPanNo(panNo);
		}
		System.out.println(delegateTask.getVariable("uw2ActionDate"));
		this.sb.saveUWAction(b, "saveUW2");
		log.info("uW2 Details saved");
		
	}

}
