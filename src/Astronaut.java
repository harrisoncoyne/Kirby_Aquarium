import java.awt.*;

/**
 * Created by chales on 11/6/2017.
 */

//bounce off walls

public class Astronaut {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.
    public Rectangle rec;
    public int bite;


    // METHOD DEFINITION SECTION

    // Constructor Definition
    // A constructor builds the object when called and sets variable values.


    //This is a SECOND constructor that takes 3 parameters.  This allows us to specify the hero's name and position when we build it.
    // if you put in a String, an int and an int the program will use this constructor instead of the one above.
    int x, y;

    public Astronaut(int pXpos, int pYpos) {
        xpos = pXpos;
        //ypos = (int)(Math.random()*100);
        //ypos = pYpos;
        //dx = 10;
        dx = 5;
        //dx = -5 - (int)(Math.random()*10);
        dy = 10;
        width = 60;
        height = 60;
        isAlive = true;
        rec = new Rectangle(xpos,ypos, width, height);
        //bite = 0+(int)Math.random();

    } // constructor




    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    //int ballSpeedX = 1;
    //int ballSpeedY = 1;

    public void move() {

        int gridX, gridY;

        gridX = 1000-width;
        gridY = 700-width;
        xpos = xpos + dx;
        ypos = ypos + dy;
        if (xpos < 0) {
            dx = -dx;
            xpos = 0;
        } else if (xpos > gridX) {

            dx = -dx;
            xpos = gridX;
        }
        if (ypos < 0) {
            dy = -dy;
            ypos = 0;
        } else if (ypos > gridY) {
            dy = -dy;
            ypos = gridY;
        }

        //if () {
        rec = new Rectangle(xpos, ypos, width, height);
        //}

        //if(dx>0){

        //}

    }

}







