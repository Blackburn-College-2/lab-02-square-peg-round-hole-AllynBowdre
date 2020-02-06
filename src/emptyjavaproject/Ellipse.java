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
public class Ellipse {
    double major,minor;
    public Ellipse(double a, double b){
        this.major=a;
        this.minor=b;
    }
    
    public double getArea(){
        return (Math.PI*major*minor);
    }
    
    
    public double getPerimeter(){
        return (2*Math.PI*(Math.sqrt(((major*major)+(minor*minor))/2.0)));
    }
    
    public String toString(){
        Measurement a = new Measurement(this.major,"feet");
        Measurement b = new Measurement(this.minor,"feet");
        return ("Ellipse of " + a + " by " + b);
    }
}
