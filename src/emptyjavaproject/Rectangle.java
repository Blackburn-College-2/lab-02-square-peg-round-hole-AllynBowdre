package emptyjavaproject;

/**
 *
 * @author allyn
 */
public class Rectangle {
    double width,length;
    
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        System.out.println("New Rectangle: " + this.width + " by " + this.length);
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getArea(){
        return ((this.length)*(this.width));
    }
    
    public double getPerimeter(){
        return ((this.length*2.0)+(this.width*2.0));
    } 
   
    @Override
    public String toString(){
        Measurement w = new Measurement(this.width,"feet");
        Measurement l = new Measurement(this.length,"feet");
        return ("Rectangle of " + w + " by " + l);
    }
    
}
