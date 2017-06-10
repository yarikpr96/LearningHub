package edu.lhub.home1.entity;

import edu.lhub.home1.Electrical;
import edu.lhub.home1.KitchenAppliances;
import edu.lhub.home1.Small;

/**
 * Created by Ярослав on 05.06.2017.
 */
public class Blender extends KitchenAppliances implements Electrical,Small{
    @Override
    public String toString() {
        return "Blender{} " + super.toString();
    }

    @Override
    public void electricalOn() {
        System.out.println("Kettle On");
    }

    @Override
    public void electricalOff() {
        System.out.println("Kettle Off");
    }


    @Override
    public void easyMove() {
        System.out.println("Moved");
    }
}
