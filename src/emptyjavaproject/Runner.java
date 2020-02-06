package emptyjavaproject;

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //#3
        Rectangle rec1 = new Rectangle(5.0,8.0);
        Rectangle rec2 = new Rectangle(7.0,4.0);
        Square sqr1 = new Square(6.0);
        Square sqr2 = new Square(9.0);
        Ellipse elip1 = new Ellipse(10.0,5.0);
        Circle cir1 = new Circle(7.2);
       
        
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(sqr1);
        System.out.println(sqr2);
        System.out.println(elip1);
        System.out.println(cir1);
        
        
        
        
    }
    
}
