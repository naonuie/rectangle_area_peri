// This program calculates the area and perimeter of a rectangle using its width and height 

import java.util.Scanner; 

public class rectangle {
    
    public static void main (String [] args) 
        {
            Scanner scan = new Scanner (System.in);
            System.out.println ("This program calculates the area and perimeter of a rectangle using its width and height");
            System.out.println ("Please enter the width of the sides: ");
            int width = scan.nextInt ();
            System.out.println ("Please enter the height of the sides: ");
            int height = scan.nextInt ();
            
            int area = width*height; 
            int perimeter = (2*height) + (2*width);
            
            System.out.println ("The area of the rectangle is " + area);
            System.out.println ("The perimeter of the rectangle is " + perimeter);

        }
}
