
package com.hms.model;

/**
 *
 * MD. JOBAYER ISLAM
 */
public class RadiologicalTest extends LabTest{
//    private String title;
//    private double cost;
//    private boolean isAvailable;
    private final String plateDimention;  
    
    public RadiologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String plateDimention){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable; 
        this.plateDimention = plateDimention;
    }
   
    public String returnTestInfo(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                + "Plate Dimention: "+this.plateDimention+"\n"
                + "Availability: "+this.isAvailable+"\n";
        return output;
    }

    public double calcCost() {
        double totalCost=0;
        
        return totalCost;
    }

}
