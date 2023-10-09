/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentreport;

/**
 *
 * @author jorda
 */
public abstract class EstateAgent implements iEstateAgent {
  private String agentname;
  private double propertyprice;
  //now that we have extablished the parameters that we need, its time to move onto collecting the information for those parameters.


      public EstateAgent(String agentname, double propertyprice) {
  this.agentname = agentname;
  this.propertyprice = propertyprice;
      }
  
public String getAgentName() {
    return agentname;
}
public double getPropertyPrice() {
    return propertyprice;
}

      }
        
    

    
    

