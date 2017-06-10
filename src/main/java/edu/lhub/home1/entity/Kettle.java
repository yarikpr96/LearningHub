package edu.lhub.home1.entity;

import edu.lhub.home1.Electrical;
import edu.lhub.home1.KitchenAppliances;
import edu.lhub.home1.Small;
import lombok.Data;


@Data
public class Kettle extends KitchenAppliances implements Electrical, Small {


    @Override
    public String toString() {
        return "Kettle{} " + super.toString();
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
