/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

/**
 *
 * @author hp
 */
public class budgetManagementModelClass {
    private double approximateBudgetForAwayMatches;
    private double approximateBudgetForTransportation ;
    private double approximateBudgetForFoodAndWaterSupply; 
    private double approximateBudgetForKitExpenditure;

    public budgetManagementModelClass(double approximateBudgetForAwayMatches, double approximateBudgetForTransportation, double approximateBudgetForAndWaterSupply, double approximateBudgetForKitAndWaterSupply) {
        this.approximateBudgetForAwayMatches = approximateBudgetForAwayMatches;
        this.approximateBudgetForTransportation = approximateBudgetForTransportation;
        this.approximateBudgetForFoodAndWaterSupply = approximateBudgetForAndWaterSupply;
        this.approximateBudgetForKitExpenditure = approximateBudgetForKitAndWaterSupply;
    }

    public double getApproximateBudgetForAwayMatches() {
        return approximateBudgetForAwayMatches;
    }

    public void setApproximateBudgetForAwayMatches(double approximateBudgetForAwayMatches) {
        this.approximateBudgetForAwayMatches = approximateBudgetForAwayMatches;
    }

    public double getApproximateBudgetForTransportation() {
        return approximateBudgetForTransportation;
    }

    public void setApproximateBudgetForTransportation(double approximateBudgetForTransportation) {
        this.approximateBudgetForTransportation = approximateBudgetForTransportation;
    }

    public double getapproximateBudgetForFoodAndWaterSupply() {
        return approximateBudgetForFoodAndWaterSupply;
    }

    public void setApproximateBudgetForAndWaterSupply(double approximateBudgetForFAndWaterSupply) {
        this.approximateBudgetForFoodAndWaterSupply = approximateBudgetForFoodAndWaterSupply;
    }

    public double getapproximateBudgetForKitExpenditure() {
        return approximateBudgetForKitExpenditure;
    }

    public void setApproximateBudgetForKitAndWaterSupply(double approximateBudgetForKitExpenditure) {
        this.approximateBudgetForKitExpenditure = approximateBudgetForKitExpenditure;
    }


    public double totalBudget(){
    return(approximateBudgetForAwayMatches+approximateBudgetForTransportation+approximateBudgetForFoodAndWaterSupply+approximateBudgetForKitExpenditure);    
    }
    public double budpercentforAwayMatches(){
    return ((approximateBudgetForAwayMatches/totalBudget())*100);    
    }
    
    public double budpercentforFoodAndWater(){
      return((approximateBudgetForFoodAndWaterSupply/totalBudget())*100);
    }
    
     public double budpercentforTranspo(){
     return ((approximateBudgetForTransportation/totalBudget())*100);    
     }
    
    
    
      
    public double budpercentforKitAndExpend(){
       return((approximateBudgetForKitExpenditure/totalBudget())*100);  
    }

    
    
    @Override
public String toString() {
    return "budgetManagementModelClass{" + 
           "\n\tapproximateBudgetForAwayMatches=" + approximateBudgetForAwayMatches + 
           ", \n\tapproximateBudgetForTransportation=" + approximateBudgetForTransportation + 
           ", \n\tapproximateBudgetForFoodAndWaterSupply=" + approximateBudgetForFoodAndWaterSupply + 
           ", \n\tapproximateBudgetForKitExpenditure=" + approximateBudgetForKitExpenditure + 
            "Total Budget: " + totalBudget() + "\n" +
           "Percentage Budget for Away Matches: " + budpercentforAwayMatches() + "%\n" +
           "Percentage Budget for Food and Water Supply: " + budpercentforFoodAndWater() + "%\n" + 
           "Percentage Budget for Transportation: " + budpercentforTranspo() + "%\n" +
           "Percentage Budget for Kit Expenditure: " + budpercentforKitAndExpend() + "%";
            
          
}

    
    
    }






