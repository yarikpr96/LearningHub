package edu.lhub.home1;

import lombok.Data;

import java.util.List;

/**
 * Created by Ярослав on 10.06.2017.
 */
@Data
public class Kitchen {
    private double weight;
    private double height;
    private List<KitchenAppliances>kitchenAppliances;
}
