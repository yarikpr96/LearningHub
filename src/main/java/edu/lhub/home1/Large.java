package edu.lhub.home1;

/**
 * Created by Ярослав on 10.06.2017.
 */
public interface Large {
     default void hardMove(double a) {
          System.out.println(a*10);
     }


}
