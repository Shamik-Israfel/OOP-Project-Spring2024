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
public class FinancialAnalysis implements Serializable{
    private double totalIncome;
    private double totalExpenses;
    private double netIncome;
    private double netProfitMargin;
    private double returnOnAssets;
        private double assetTurnover;
    private double averageTotalAssets;
     public FinancialAnalysis(double totalIncome, double totalExpenses,
                             double averageTotalAssets) {
        this.totalIncome = totalIncome;
        this.totalExpenses = totalExpenses;
        this.averageTotalAssets = averageTotalAssets;
        
        this.netIncome = totalIncome - totalExpenses;
        this.netProfitMargin = (netIncome / totalIncome) * 100.0;
        this.returnOnAssets = netIncome / averageTotalAssets;
        this.assetTurnover = totalIncome / averageTotalAssets;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public double getNetProfitMargin() {
        return netProfitMargin;
    }

    public double getReturnOnAssets() {
        return returnOnAssets;
    }

    public double getAssetTurnover() {
        return assetTurnover;
    }

    public double getAverageTotalAssets() {
        return averageTotalAssets;
    }

    @Override
    public String toString() {
return "FinancialAnalysis{" +
                "\n\ttotalIncome=" + totalIncome +
                ",\n\ttotalExpenses=" + totalExpenses +
                ",\n\tnetIncome=" + netIncome +
                ",\n\tnetProfitMargin=" + netProfitMargin +
                ",\n\treturnOnAssets=" + returnOnAssets +
                ",\n\tassetTurnover=" + assetTurnover +
                ",\n\taverageTotalAssets=" + averageTotalAssets +
                "\n}";    }
}
