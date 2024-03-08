/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.listener;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.task.IdentityLink;
import org.camunda.bpm.engine.task.IdentityLinkType;

import com.ibm.camunda.usecase.mortgage.underwriting.delegate.SaveBorrowerDelegate;

/**
 * @author LIYAJERARD
 *
 */

public class SUWTaskListener implements TaskListener{
	private final Logger log = Logger.getLogger(SUWTaskListener.class.getName());

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		  Set<String> candidateUsersList = new HashSet<String>();
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
	      System.out.println("user added"+candidateUsersList);

		
		
	}

}
