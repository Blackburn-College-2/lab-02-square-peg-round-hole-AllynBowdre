package emptyjavaproject;

/**
 *
 * @author allyn
 */
public class Square extends Rectangle{
    double side; 
    
    public Square(double side){
        super(side,side);
        this.side=side;       
        System.out.println("New Square: " + side);
    }
    
    @Override
    public String toString(){
        Measurement s = new Measurement(side,"feet");
        return ("Square of " + s);
    }
    
    
    
}
