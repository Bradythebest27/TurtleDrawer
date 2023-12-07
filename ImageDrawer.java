
/**
 * Write a description of class Banker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import galapagos.*;
import java.awt.*;
import java.util.*;
import java.lang.Object;
import java.io.File;

public class ImageDrawer
{
    public static void main(String[] args){
        /**
         * Inputed picture file must be 400x300 pixels to get the whole picture printed
         * The file must be in the folder aswell
         * Picture class is not my work it is a public javadoc
         */
        System.out.println("What is the name of your file?(include .jpg or .png) For default just type test");
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Picture picture;
        if (s.equals("test"))
            picture=new Picture(new File("Wando.jpg"));
        else    
            picture=new Picture(new File(s));
        
        Turtle bob=new Turtle();
        bob.penSize(5);
        //System.out.println(picture.height()+" "+picture.width());
        bob.speed(100);
        for (int row=0; row<picture.width(); row++){
            for (int col=0; col<picture.height(); col++){
                bob.penUp();
                bob.jumpTo(row-150, picture.height()-col-150);
                bob.penDown();
                bob.penColor(picture.get(row,col));
                bob.forward(5);
                
            }
        }
        
    }
}
