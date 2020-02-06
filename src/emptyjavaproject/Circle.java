package emptyjavaproject;

 


public class Circle {
    double radius;
    
    public Circle(double r){
        double radius = r;
    }
    public double getArea(){
        return (Math.PI*(radius*radius));
    }
    
    
    public double getPerimeter(){
        return (2*Math.PI*radius);
    }
    
    public String toString(){
        Measurement r = new Measurement(this.radius,"feet");
        return ("Circle of " + r );
    }
  
}
