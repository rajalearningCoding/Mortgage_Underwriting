package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
@Component("propertyAppraisalReport")
public class PropertyAppraisalReport  implements JavaDelegate{
    @Override
    public void execute(DelegateExecution execution) throws Exception
    {


        /*long propertyValue=(long) execution.getVariable("propertyValue");
        //String location=(String) execution.getVariable("location");


        String appraisalResult=performPropertyAppraisal(propertyValue);

        execution.setVariable("appraisalResult",appraisalResult);*/
        System.out.println("Third party system called for property appraisal details");

        //System.out.print(appraisalResult);
//		execution.getProcessEngineServices().getRuntimeService()
//		.createMessageCorrelation("Property Appraisal Report")
//		.setVariable("appraisalResult", appraisalResult)
//		.correlate();

    }
   /* private String performPropertyAppraisal(long propertyValue) {
        // TODO Auto-generated method stub
        if(propertyValue>2000000 )
        {
            return "High Appraisal Value-Prime location";
        }
        else if(propertyValue>1000000)
        {
            return "Moderate Appraisal Value";
        }
        else
        {
            return "Low Appraisal Value";
        }

    }*/
}