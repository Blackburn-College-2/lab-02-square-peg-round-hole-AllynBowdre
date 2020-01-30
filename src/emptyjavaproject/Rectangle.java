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
        System.out.println("New Rectangle: " + width + " by " + length);
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
        return ("Rectangle of " + this.width + " by " + this.length);
    }
    
}
