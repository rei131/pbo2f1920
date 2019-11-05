/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJobsheet10;

/**
 *
 * @author Dell
 */
public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof JumpingZombie){
            ((JumpingZombie) d).heal();
            d.destroyed();
        }
        else if(d instanceof WalkingZombie){
            ((WalkingZombie) d).heal();
            d.destroyed();
        }
    }
}
