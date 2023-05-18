import processing.core.*;

public class Bomb {
    private PApplet parent;
    private int bombX;
    private int bombY;
    private int bombSize;
    private int bombSpeed;

    public Bomb(PApplet p, int centerX, int centerY){
        parent = p;
        bombX = centerX;
        bombY = centerY;
        bombSize = 5;
        bombSpeed = 5;
    
    }

    public void display(){
        parent.fill(0);
        parent.ellipse(bombX, bombY, bombSize, bombSize);
        move();
    }

    public void move(){
        bombY += bombSpeed;
    }

    public void explode(){
        if(bombY + bombSize/2 >= parent.height - 20){
            parent.fill(255, 165, 0);
            parent.ellipse(bombX,bombY,200, 200);
        }
    }


}
