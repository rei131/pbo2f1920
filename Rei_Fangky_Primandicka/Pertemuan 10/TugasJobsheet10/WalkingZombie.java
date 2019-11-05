/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJobsheet10;

import static java.awt.SystemColor.info;
import java.util.logging.Level;

/**
 *
 * @author Dell
 */
public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
    super.level=level;
    super.health=health;
    }
    public void heal(){
        switch (level) {
            case 1:
                System.out.println(health - 20);
                break;
            case 2:
                System.out.println(health - 30);
                break;
            case 3:
                System.out.println(health - 40);
                break;
            default:
                System.out.println("----------");
                break;
        }
    }
    public void destroyed(){
        if(super.health == -2){
            System.out.println(health - 2);
        } else  {
            System.out.println();
        }
    }
    public String getZombieInfo(){
        String info = super.getZombie()+"\n";
        info += "Walking Zombie Data =" +"\n health ="+health+"\n Level ="+level;
        
        return info;
    }
}
