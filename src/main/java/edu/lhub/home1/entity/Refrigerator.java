package edu.lhub.home1.entity;

import edu.lhub.home1.Electrical;
import edu.lhub.home1.KitchenAppliances;
import edu.lhub.home1.Large;

/**
 * Created by Ярослав on 15.06.2017.
 */
public class Refrigerator extends KitchenAppliances implements Large, Electrical {


    @Override
    public void electricalOn() {

    }

    @Override
    public void electricalOff() {

    }



    @Override
    public String toString() {
        return "Refrigerator{} " + super.toString();
    }
}
