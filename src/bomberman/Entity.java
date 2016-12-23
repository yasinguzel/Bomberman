/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author yasinguzel
 */
public class Entity {
    
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Image image;
    protected boolean vis;    
    int owner;
    public Entity(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    protected void loadImage(String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
    
    public Image getImage(){
        return image;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
        
    public Rectangle getBounds(){
        return new Rectangle(x, y, width, height);
    }
    
    public boolean isVisible(){
        return vis;
    }
    
    public void setVisible(Boolean visible){
        vis = visible;
    }
}
