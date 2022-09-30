import java.awt.*;

public class PointsCounter {

        public String name;
        public int points;
        public int xpos;
        public int ypos;
        public int width;
        public int height;
        public Rectangle rec;


        int a, b;

        public PointsCounter (int bXpos, int bYpos) {
            points = 0;
            xpos = bXpos;
            ypos = bYpos;
            width = 100;
            height = 100;
            rec = new Rectangle(xpos,ypos, width, height);

        }



}
