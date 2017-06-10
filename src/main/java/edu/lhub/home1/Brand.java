package edu.lhub.home1;

import lombok.Data;

/**
 * Created by Ярослав on 10.06.2017.
 */
@Data
public class Brand {
    private String nameBrand;

    public Brand(String nameBrand) {
        this.nameBrand = nameBrand;
    }


}
