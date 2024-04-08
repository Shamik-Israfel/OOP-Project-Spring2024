/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class expensesTrackingSystemModelclass implements Serializable {

    private double amountUsedForFoodAndWatersupply;
    private double amountOfKitsExpenditure;
    private double amountForTraininigSession;
    private double amountUsedForTotalSalaries;
    

    public expensesTrackingSystemModelclass(double amountUsedForFoodAndWatersupply, double amountOfKitsExpenditure, double amountForTraininigSession, double amountUsedForTotalSalaries) {
        this.amountUsedForFoodAndWatersupply = amountUsedForFoodAndWatersupply;
        this.amountOfKitsExpenditure = amountOfKitsExpenditure;
        this.amountForTraininigSession = amountForTraininigSession;
        this.amountUsedForTotalSalaries = amountUsedForTotalSalaries;
    }

    public double getAmountUsedForFoodAndWatersupply() {
        return amountUsedForFoodAndWatersupply;
    }

    public void setAmountUsedForFoodAndWatersupply(double amountUsedForFoodAndWatersupply) {
        this.amountUsedForFoodAndWatersupply = amountUsedForFoodAndWatersupply;
    }

    public double getAmountOfKitsExpenditure() {
        return amountOfKitsExpenditure;
    }

    public void setAmountOfKitsExpenditure(double amountOfKitsExpenditure) {
        this.amountOfKitsExpenditure = amountOfKitsExpenditure;
    }

    public double getAmountForTraininigSession() {
        return amountForTraininigSession;
    }

    public void setAmountForTraininigSession(double amountForTraininigSession) {
        this.amountForTraininigSession = amountForTraininigSession;
    }

    public double getAmountUsedForTotalSalaries() {
        return amountUsedForTotalSalaries;
    }

    public void setAmountUsedForTotalSalaries(double amountUsedForTotalSalaries) {
        this.amountUsedForTotalSalaries = amountUsedForTotalSalaries;
    }

  

    

    public double TotAmountForExpenses() {
        return amountUsedForFoodAndWatersupply + amountOfKitsExpenditure + amountForTraininigSession + amountUsedForTotalSalaries;
    }

    public double AvexpensesperCateg() {
        return (TotAmountForExpenses() / 4);
    }

    public double PerOfExpFoodAndWaterSupply() {
        return (amountUsedForFoodAndWatersupply / TotAmountForExpenses()) * 100;
    }

    public double PerOfExpByKitsExpenditure() {
        return (amountOfKitsExpenditure / TotAmountForExpenses()) * 100;
    }

    public double PerOfExpByTraininigSession() {
        return (amountForTraininigSession / TotAmountForExpenses()) * 100;
    }

    public double PerOfExpensesForToySal() {
        return (amountUsedForTotalSalaries / TotAmountForExpenses()) * 100;
    }

    @Override
    public String toString() {
        return "expensesTrackingSystemModelclass{"
                + "\n    amountUsedForFoodAndWatersupply=" + amountUsedForFoodAndWatersupply
                + ",\n    amountOfKitsExpenditure=" + amountOfKitsExpenditure
                + ",\n    amountForTraininigSession=" + amountForTraininigSession
                + ",\n    amountUsedForTotalSalaries=" + amountUsedForTotalSalaries
                + ",\n    totalAmountForExpenses=" + TotAmountForExpenses()
                + ",\n    averageexpensesperCategory=" + AvexpensesperCateg()
                + ",\n    percentageOfExpensesByFoodAndWaterSupply=" + PerOfExpFoodAndWaterSupply()
                + ",\n    percentageOfExpensesByKitsExpenditure=" + PerOfExpByKitsExpenditure()
                + ",\n    percentageOfExpensesByTraininigSession=" + PerOfExpByTraininigSession()
                + ",\n    percentageOfExpensesForTotalSalaries=" + PerOfExpensesForToySal()
                + "\n}";
    }


}

