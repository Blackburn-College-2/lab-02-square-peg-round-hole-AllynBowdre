/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author allyn
 */
public class Measurement {
    double value=0;
    String unit="";
    
    public Measurement(double v, String u){
        this.value=v;
        this.unit=u;
    }
    @Override
    public String toString(){
        return ( this.value + " " + this.unit + "(s)");
    }
}
