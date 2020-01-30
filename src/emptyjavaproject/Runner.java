/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
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
        
        //#4
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(sqr1);
        System.out.println(sqr2);
        
        
        
    }
    
}
