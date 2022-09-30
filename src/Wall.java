import javafx.scene.shape.Circle;

import java.awt.*;

public class Wall{

        public String name;
        public int apos;
        public int bpos;
        public int da;
        public int db;
        public int width;
        public int height;
        public boolean isAlive;
        public Rectangle rec;
        public Rectangle topRec;
        public Rectangle bottomRec;

        public Circle topCircle;
        public Circle bottomCircle;
        //Make rectangles of top and bottom of walls


        int a, b;

        public Wall (int bXpos, int bYpos) {
            apos = bXpos;
            bpos = bYpos;
            //da = 10;
            //db = 10;
            //da = (int)(Math.random()*10);
            db = (int)(Math.random()*10);
            width = 50;
            height = 250;
            isAlive = true;
            rec = new Rectangle(apos,bpos, width, height);
            //topRec = new Rectangle(apos, bpos-5, 50, 5);
            //bottomRec = new Rectangle(apos, bpos+250, 50, 5);
            //topCircle = new Circle(apos, bpos+225,25);
            //topCircle = new Circle(apos, bpos+225,25);


        }

        public void move() {

            int gridX, gridY;
            //int gridX, gridY;

            gridX = 1000 - width;
            gridY = 700 - height;
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

            //rec = new Rectangle(apos,bpos, width, height);

            //if(da>0){

            //}
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
            //topRec = new Rectangle(apos, bpos+10, 50, 10);
            //bottomRec = new Rectangle(apos, bpos-250, 50, 10);
            topRec = new Rectangle(apos-5, bpos, width-20, height);
            bottomRec = new Rectangle(apos-5, bpos, width-20, height);

        }
    }
