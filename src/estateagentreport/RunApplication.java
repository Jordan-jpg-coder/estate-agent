/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentreport;

/**
 *
 * @author jorda
 */
public class RunApplication {
     public static void main(String[] Args) {
        EstateAgentSales sales = new EstateAgentSales("Jeffrey Senegal", 500000);
         
         sales.printPropertyReport();
     }
}
