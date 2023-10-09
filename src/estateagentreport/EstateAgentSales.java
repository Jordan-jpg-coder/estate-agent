/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentreport;

/**
 *
 * @author jorda
 */
public class EstateAgentSales extends EstateAgent {
    //we are declaring the commission rate as 20% of the property price or 0.2* the property price
    private static double CommissionRate = 0.2;
    
//here we are declaring the constructor that was needed with its parameters
    public EstateAgentSales(String AgentName, double PropertyPrice) {
        super(AgentName, PropertyPrice);
    }
    //overriding the method to calculate the commission earned
    public double getAgentCommission() {
        return getPropertyPrice()*CommissionRate;
    }
    //now we need to print out the property reporrt!
    public void printPropertyReport() {
        //now we need to print everything out
        System.out.println("The name of the estate agent is: " + getAgentName());
              System.out.println("The price of the property is: " + getPropertyPrice());
        System.out.println("The commission that the agent has earned is: " + getAgentCommission());
        //now that all of that is done, we can create the class that was needed to test and run the application.
        //once it has been created all we need to is create a new object with some sample data and call apong the property report method.
    }

    
    
    
    
    
    
    
    
    
    @Override
    public String getAgentName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPropertyPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    }
    
    

