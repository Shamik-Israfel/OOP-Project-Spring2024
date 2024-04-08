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

public class incomeManagement implements Serializable{

    
    //private Integer year;
    private double sellingTickets;
    private double sponsorDeals;
    private double broadcastsRights;
    private double totalIncome;
    private double  sellingTicketsDistribution;
    private double  sponsorDealsDistribution;
    private double broadcastsRightsDistribution;
    
    
 public incomeManagement(double sellingTickets, double sponsorDeals, double broadcastsRights) {
        
        //this.year=year;
        this.sellingTickets = sellingTickets;
        this.sponsorDeals = sponsorDeals;
        this.broadcastsRightsDistribution = broadcastsRightsDistribution;
        
        
        
        this.totalIncome = sellingTickets+sponsorDeals+broadcastsRights;
        this.sellingTicketsDistribution=(sellingTickets/totalIncome)*100.0;
        this.sponsorDealsDistribution=(sponsorDeals/totalIncome)*100.0;
        this.broadcastsRightsDistribution=(broadcastsRights/totalIncome)*100.0;

}

    //public Integer getYear() {
        //return year;
    //}

    //public void setYear(Integer year) {
      //  this.year = year;
    //}

    public double sellingTicketsDistribution() {
        return sellingTicketsDistribution;
    }

    public double sponsorDealsDistribution() {
        return sponsorDealsDistribution;
    }

    public double getbroadcastsRightsDistribution() {
        return broadcastsRightsDistribution;
    }

    @Override
public String toString() {
    return "incomeManagement{" +
          //  "\n    year=" + year +
            "\n    sellingTickets=" + sellingTickets +
            ",\n    sponsorDeals=" + sponsorDeals +
            ",\n    broadcastsRights=" + broadcastsRights +
            ",\n    totalIncome=" + totalIncome +
            ",\n    sellingTicketsDistribution=" + sellingTicketsDistribution +
            ",\n    sponsorDealsDistribution=" + sponsorDealsDistribution +
            ",\n    broadcastsRightsDistribution=" + broadcastsRightsDistribution +
            "\n}";
}

















}