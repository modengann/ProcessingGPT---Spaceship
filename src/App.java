import processing.core.*;
import java.util.*;

public class App extends PApplet {
    Spaceship ship;
    ArrayList<Bomb> bombs;
   
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings(){
        size(800, 600);
    }

    public void setup(){
        bombs = new ArrayList<>();
        ship = new Spaceship(this, 100, 100);
    }

    public void draw(){
        background(190);
        ship.move();
        ship.display();
        

        for(Bomb b : bombs){
            b.display();
            b.explode();
            
        }
    }

    public void keyPressed(){

        if(keyCode == RIGHT){
            ship.setRight(true);
        } else if(keyCode == LEFT){
            ship.setLeft(true);
        }

        if(key == ' '){
            bombs.add(ship.createBomb());
        }
    }

    public void keyReleased(){
        if(keyCode == RIGHT){
            ship.setRight(false);
        } else if(keyCode == LEFT){
            ship.setLeft(false);
        }
    }

   



}
