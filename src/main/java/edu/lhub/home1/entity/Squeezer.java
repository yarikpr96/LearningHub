package edu.lhub.home1.entity;

import edu.lhub.home1.KitchenAppliances;
import edu.lhub.home1.Mechanical;
import edu.lhub.home1.Small;

/**
 * Created by Ярослав on 05.06.2017.
 */
public class Squeezer extends KitchenAppliances implements Small, Mechanical {
    @Override
    public String toString() {
        return "Squeezer{} " + super.toString();
    }

    @Override
    public void easyMove() {
        System.out.println("Moved");
    }

    @Override
    public void hardWork() {
        System.out.println("Go Go Go");
    }
}
