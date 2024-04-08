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
    private double totalAmountForExpenses;
    private double averageexpensesperCategory;
    private double percentageOfExpensesByFoodAndWaterSupply;
    private double percentageOfExpensesByKitsExpenditure;
    private double percentageOfExpensesByTraininigSession;
    private double percentageOfExpensesForTotalSalaries;

    public expensesTrackingSystemModelclass(double amountUsedForFoodAndWatersupply, double amountOfKitsExpenditure, double amountForTraininigSession, double amountUsedForTotalSalaries) {
        this.amountUsedForFoodAndWatersupply = amountUsedForFoodAndWatersupply;
        this.amountOfKitsExpenditure = amountOfKitsExpenditure;
        this.amountForTraininigSession = amountForTraininigSession;
        this.amountUsedForTotalSalaries = amountUsedForTotalSalaries;

        this.totalAmountForExpenses = amountUsedForFoodAndWatersupply + amountOfKitsExpenditure + amountForTraininigSession + amountUsedForTotalSalaries;
        this.averageexpensesperCategory = totalAmountForExpenses / 4;
        this.percentageOfExpensesByFoodAndWaterSupply = (amountUsedForFoodAndWatersupply / totalAmountForExpenses) * 100;
        this.percentageOfExpensesByKitsExpenditure = (amountOfKitsExpenditure / totalAmountForExpenses) * 100;
        this.percentageOfExpensesByTraininigSession = (amountForTraininigSession / totalAmountForExpenses) * 100;
        this.percentageOfExpensesForTotalSalaries = (amountUsedForTotalSalaries / totalAmountForExpenses) * 100;

    }

    public double getTotalAmountForExpenses() {
        return totalAmountForExpenses;
    }

    public double getAverageexpensesperCategory() {
        return averageexpensesperCategory;
    }

    public double getPercentageOfExpensesByFoodAndWaterSupply() {
        return percentageOfExpensesByFoodAndWaterSupply;
    }

    public double getPercentageOfExpensesByKitsExpenditure() {
        return percentageOfExpensesByKitsExpenditure;
    }

    public double getPercentageOfExpensesByTraininigSession() {
        return percentageOfExpensesByTraininigSession;
    }

    public double getPercentageOfExpensesForTotalSalaries() {
        return percentageOfExpensesForTotalSalaries;
    }

    @Override
    public String toString() {
        return "expensesTrackingSystemModelclass{"
                + "\n    amountUsedForFoodAndWatersupply=" + amountUsedForFoodAndWatersupply
                + ",\n    amountOfKitsExpenditure=" + amountOfKitsExpenditure
                + ",\n    amountForTraininigSession=" + amountForTraininigSession
                + ",\n    amountUsedForTotalSalaries=" + amountUsedForTotalSalaries
                + ",\n    totalAmountForExpenses=" + totalAmountForExpenses
                + ",\n    averageexpensesperCategory=" + averageexpensesperCategory
                + ",\n    percentageOfExpensesByFoodAndWaterSupply=" + percentageOfExpensesByFoodAndWaterSupply
                + ",\n    percentageOfExpensesByKitsExpenditure=" + percentageOfExpensesByKitsExpenditure
                + ",\n    percentageOfExpensesByTraininigSession=" + percentageOfExpensesByTraininigSession
                + ",\n    percentageOfExpensesForTotalSalaries=" + percentageOfExpensesForTotalSalaries
                + "\n}";
    }

}


