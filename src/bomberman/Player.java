/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;


/**
 *
 * @author blacklake
 */
public class Player extends Entity
{
    private int dx;
    private int dy;
    
    public Player(int x, int y)
    {
        super(x, y);
        InitPlayer();
    }


    private void InitPlayer()
    {
        loadImage("images/Player/player.png");
        getImageDimensions();
    }
    
    public void move(){
            x+=dx;
            y+=dy;
            //System.out.println("PlayerX: "+x+" PlayerY: "+y+"PlayerDx: "+dx+"PlayerDY: "+dy);
            setZero();
    }
    
    public void setDx(int dx){
        this.dx = dx;
    }
    
    public void setDy(int dy){
        this.dy = dy;
    }
    
    public void setZero(){
        dx = 0;
        dy = 0;
    }
    
    

}
