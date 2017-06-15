package edu.lhub.home1;

import edu.lhub.home1.entity.Kettle;
import edu.lhub.home1.entity.Multicookings;
import edu.lhub.home1.entity.Refrigerator;
import edu.lhub.home1.entity.Squeezer;

import java.util.ArrayList;
import java.util.List;

import static edu.lhub.home1.Small.eMove;


public class Main {

    public static void main(String[] args) {
        Kettle kettle = new Kettle();
        kettle.setBrand(new Brand("LG"));
        kettle.setPrice(600);
        kettle.setDescription("Cool");
        kettle.doWORK();
        kettle.electricalOn();
        System.out.println(kettle);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Squeezer squeezer = new Squeezer();
        squeezer.setBrand(new Brand("Gorenje"));
        squeezer.setPrice(300);
        squeezer.setDescription("No bad");
        squeezer.doWORK();
        squeezer.hardWork();
        System.out.println(squeezer);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Multicookings multicookings = new Multicookings();
        multicookings.setBrand(new Brand("Moulinex"));
        multicookings.setPrice(1600);
        multicookings.setDescription("Good");
        multicookings.doWORK();
        multicookings.electricalOff();

        System.out.println(multicookings);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        eMove();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<KitchenAppliances> kitchenAppliancesList = new ArrayList<>();
        kitchenAppliancesList.add(kettle);
        kitchenAppliancesList.add(squeezer);
        kitchenAppliancesList.add(multicookings);


        Kitchen kitchen = new Kitchen();
        kitchen.setHeight(20);
        kitchen.setWeight(30);
        kitchen.setKitchenAppliances(kitchenAppliancesList);
        System.out.println(kitchen);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        kitchenAppliancesList.stream().filter(kitchenAppliances -> kitchenAppliances.getBrand().equals(new Brand("LG"))).forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setBrand(new Brand("Moulinex"));
        refrigerator.setPrice(1600);
        refrigerator.setDescription("Good");
        refrigerator.hardMove(10);
        System.out.println(refrigerator);

    }
}
