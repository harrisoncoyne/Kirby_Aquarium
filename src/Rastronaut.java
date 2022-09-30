
//warp around walls

import java.awt.*;

public class Rastronaut {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;                //holds the name of the hero
    public int apos;                //the x position
    public int bpos;                //the y position
    public int da;                    //the speed of the hero in the x direction
    public int db;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle rec;


    int a, b;

    public Rastronaut(int bXpos, int bYpos) {
        apos = bXpos;
        bpos = bYpos;
        da = 10;
        db = 0;
        width = 60;
        height = 60;
        isAlive = true;
        rec = new Rectangle(apos,bpos, width, height);

    }

    public void move() {

        int gridX, gridY;
        //int gridX, gridY;

        gridX = 950;
        gridY = 650;
        apos = apos + da;
        bpos = bpos + db;
        if (apos < 0) {
            da = -da;
            apos = 0;
        } else if (apos > gridX) {

            da = -da;
            apos = gridX;
        }
        if (bpos < 0) {
            db = -db;
            bpos = 0;
        } else if (bpos > gridY) {
            db = -db;
            bpos = gridY;
        }
        rec = new Rectangle(apos,bpos, width, height);

        if(da>0){

        }
        //gridX = 900;
        //gridY = 600;
        //apos = apos + da;
        //bpos = bpos + db;
        //if (apos < 0) {
            //apos=950;
            //bpos=bpos;
        //} else if (apos > 900) {
            //apos=0;
            //bpos=bpos;
        //if (bpos < 0) {
            //apos=apos;
            //bpos=650;
        //} else if (bpos > 550) {
            //apos=apos;
            //bpos=0;
        //}
            rec = new Rectangle(apos,bpos, width, height);

        }
}

