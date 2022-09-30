import java.awt.*;

public class Food {

    public String name;
    private int apos;
    public int bpos;
    public int da;
    public int db;
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle rec;


    int a, b;

    public int getApos(){
        return apos;
    }

    public Food(int apos, int bpos) {
        this.apos = apos;
        this.bpos = bpos;
        //da = 10;
        //db = 10;
        da = (int)(Math.random()*10);
        db = (int)(Math.random()*10);
        //width = (int)(Math.random()*100);
        width = 60;
        height = width;
        isAlive = true;
        rec = new Rectangle(apos,bpos, width, height);

    }

    public void move() {

        int gridX, gridY;
        //int gridX, gridY;

        gridX = 950;
        gridY = 650;
        this.apos = this.apos + da;
        this.bpos = this.bpos + db;
        if (this.apos < 0) {
            da = -da;
            this.apos = 0;
        } else if (this.apos > gridX) {

            da = -da;
            this.apos = gridX;
        }
        if (this.bpos < 0) {
            db = -db;
            this.bpos = 0;
        } else if (this.bpos > gridY) {
            db = -db;
            this.bpos = gridY;
        }
        rec = new Rectangle(this.apos,this.bpos, width, height);

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

