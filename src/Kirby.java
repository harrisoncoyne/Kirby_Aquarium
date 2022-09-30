import javafx.scene.shape.Circle;

import java.awt.*;

public class Kirby {

    public String name;
    public int xpos;
    public int ypos;
    public int dx;
    public int dy;
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle rec;
    public Circle circle;
    public int bite;


    int x, y;

    public Kirby(int pXpos, int pYpos) {
        xpos = pXpos;
        //ypos = (int)(Math.random()*100);
        ypos = pYpos;
        //dx = 10;
        dx=5;
        //dx = (int)(Math.random()*10);
        //dx = -5 - (int)(Math.random()*10);
        dy = 10;
        //dy = (int)(Math.random()*20);
        width = 60;
        height = 60;
        isAlive = true;
        rec = new Rectangle(xpos,ypos, width, height);
        circle = new Circle(xpos,ypos, width/2);
        //bite = 0+(int)Math.random();

    } // constructor




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
        //circle = new Circle(xpos,ypos, width/2);

        //}

        //if(dx>0){

        //}

    }

}







