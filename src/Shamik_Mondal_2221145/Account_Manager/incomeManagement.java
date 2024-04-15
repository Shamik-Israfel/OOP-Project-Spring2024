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

    public incomeManagement(double sellingTickets, double sponsorDeals, double broadcastsRights) {
        this.sellingTickets = sellingTickets;
        this.sponsorDeals = sponsorDeals;
        this.broadcastsRights = broadcastsRights;
    }

    public double getSellingTickets() {
        return sellingTickets;
    }

    public void setSellingTickets(double sellingTickets) {
        this.sellingTickets = sellingTickets;
    }

    public double getSponsorDeals() {
        return sponsorDeals;
    }

    public void setSponsorDeals(double sponsorDeals) {
        this.sponsorDeals = sponsorDeals;
    }

    public double getBroadcastsRights() {
        return broadcastsRights;
    }

    public void setBroadcastsRights(double broadcastsRights) {
        this.broadcastsRights = broadcastsRights;
    }
   
    
    


    //public Integer getYear() {
        //return year;
    //}

    //public void setYear(Integer year) {
      //  this.year = year;
   
   

    public double tIncome(){
        return (sellingTickets+sponsorDeals+broadcastsRights);}
    
    public double sellTicketsDist(){
         return ((sellingTickets/tIncome())*100.0);}
    
     public double sponDealsDist(){
         return ((sponsorDeals/tIncome())*100.0);}
     
     public double broadRightsDist(){
        return ((broadcastsRights/tIncome())*100.0);
     }
     
     
    
    @Override 
public String toString() {
    return "incomeManagement{" +
          //  "\n    year=" + year +
            "\n    sellingTickets=" + sellingTickets +
            ",\n    sponsorDeals=" + sponsorDeals +
            ",\n    broadcastsRights=" + broadcastsRights +
            ",\n    totalIncome=" + tIncome() +
            ",\n    sellingTicketsDistribution=" + sellTicketsDist() +
            ",\n    sponsorDealsDistribution=" + sponDealsDist() +
            ",\n    broadcastsRightsDistribution=" + broadRightsDist() +
            "\n}";
}

















}