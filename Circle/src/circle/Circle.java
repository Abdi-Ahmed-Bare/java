/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *@see 
 * @author aabar
 */
public class Circle {

    int r;
    int x, y;
    /**
     * 
     * @return 
     */
    double circumference(){
        return 2*r*3.14;
    }
    /**
     * 
     * @param r
     * @return 
     */
    double area (){
   
        
        return r*r*3.14;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello Abdi");
        System.out.println("hello Abdi");
        System.out.println("hello Abdi");
        System.out.print("hello Abdi");
        System.out.println("hello Abdi");
        
        
        Circle c = new Circle();
        c.r = 10;
        double circum = c.circumference();
//        System.out.println("circumference = " + circum);
        double area = c.area ();
//        System.out.println("Area = "+ area);
        
        int a;
        a = -10;
//        System.out.println("a is " + a );
        
        int x, y;
        x = y = 10;
        y = 20;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
        int z;
        z = x + y;
//        System.out.println("z = " + z);
//        ++x;
//        System.out.println("++x is " + x);
//        x+=y;
        x = x + y;
//        System.out.println("new x = " + x);
//        System.out.println("divison remainder = " + x%y);
        
        Circle c2 = new Circle();
        c2.r = 32;
        Circle c3 = new Circle();
        c3 = c2;
        c3.r= 42;
        c2.r = 52;
//        System.out.println("c2.r  = " +c2.r);
//        System.out.println("c3.r = "+ c3.r);
            
        int d = 30;
        int e = 62;
        float s = (float)e/d;
        System.out.println(s);
                
    }
    
}

