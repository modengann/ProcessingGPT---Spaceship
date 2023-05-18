import java.util.ArrayList;

import processing.core.*;

public class Spaceship {

    private PApplet parent;
    private int pilotColor;
    private int bodyColor;
    private int centerX;
    private int centerY;
    private int pilotSize;
    private int bodyWidth;
    private int bodyHeight;
    private int speed;
    private int changeX;
    private boolean leftMove, rightMove;
    


    public Spaceship(PApplet p, int cX, int cY){
        parent = p;
        centerX = cX;
        centerY = cY;
        pilotColor = randomColor();
        bodyColor = randomColor();
        pilotSize = 40;
        bodyWidth = 100;
        bodyHeight = 40;
        speed = 5;
        changeX = 0;
        leftMove = false;
        rightMove = false;
    }

    private int randomColor(){
        return parent.color(parent.random(255), parent.random(255), parent.random(255));
    }

    public void move(){
        if(leftMove){
            changeX = -3;
        }else if(rightMove){
            changeX = 3;
        }else{
            changeX = 0;
        }
        centerX += speed * changeX;
        
    }


    public Bomb createBomb(){
        Bomb temp = new Bomb(parent, centerX, centerY);
        return temp;
    }

    public void display(){
        parent.fill(bodyColor);
        parent.ellipse(centerX, centerY + bodyHeight/2, bodyWidth, bodyHeight);

        parent.fill(pilotColor);
        parent.ellipse(centerX, centerY, pilotSize, pilotSize);
    }

    public void setRight(boolean b) {
        rightMove = b;
    }

    public void setLeft(boolean b) {
        leftMove = b;
    }




    
}
