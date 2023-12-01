package projectzoo;

import projectzoo.animals.*;
import projectzoo.controller.Zoo;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Lion lion1 = new Lion("Nala", "Ribs", 4, LocalDate.of(2019, 1, 23), 2.0, 1.28, 40);
        Lion lion2 = new Lion("Leo", "Chicken", 8, LocalDate.of(2015, 4, 10), 1.09, 1.17, 36);
        Lion lion3 = new Lion("Rin", "Pork", 10, LocalDate.of(2013, 12, 5), 2.80, 1.20, 55);

        Tiger tiger1 = new Tiger("Baghera", "Meat", 3, LocalDate.of(2020, 8, 20), 2.50, 0.80, 39);
        Tiger tiger2 = new Tiger("Max", "Ribs", 14, LocalDate.of(2009, 11, 30), 1.88, 1.10, 47);
        Tiger tiger3 = new Tiger("Kai", "Pork", 8, LocalDate.of(2015, 3, 24), 1.50, 1.80, 34);

        Eagle eagle1 = new Eagle("Neon", "Rabbit", 30, LocalDate.of(1993, 10, 18), 3.40, 0.69, 23);
        Eagle eagle2 = new Eagle("Bubi", "Chicken", 30, LocalDate.of(1993, 5, 1), 2.48, 0.90, 33);
        Eagle eagle3 = new Eagle("Mina", "Mouse", 1, LocalDate.of(2023, 6, 28), 1.98, 0.45, 13);


        zoo.putAnimal(lion1);
        zoo.putAnimal(lion2);
        zoo.putAnimal(lion3);

        zoo.putAnimal(tiger1);
        zoo.putAnimal(tiger2);
        zoo.putAnimal(tiger3);

        zoo.putAnimal(eagle1);
        zoo.putAnimal(eagle2);
        zoo.putAnimal(eagle3);


        Optional<Animal> tallestLion = zoo.getTallestAnimal(Lion.class);
        System.out.println("the tallest lion is " + tallestLion.get().getNickname());

        Optional<Animal> lowestEagle = zoo.getLowestAnimal(Eagle.class);
        System.out.println("the lowest eagle is " + lowestEagle.get().getNickname());

        Optional<Animal> heaviestLion = zoo.getHeaviestAnimal(Lion.class);
        System.out.println("the heaviest lion is " + heaviestLion.get().getNickname());

        Optional<Animal> lightestTiger = zoo.getLightestAnimal(Tiger.class);
        System.out.println("the lightest tiger is " + lightestTiger.get().getNickname());

        Optional<Animal> longestTailedAnimal = zoo.getLongestTailedAnimal();
        System.out.println("The longest tailed animal is " + longestTailedAnimal.get().getNickname());

        Optional<Animal> widestWingspanAnimal = zoo.getWidestWingspan();
        System.out.println("The widest wingspan animal is " + widestWingspanAnimal.get().getNickname());

        /*
        int totalAnimals = zoo.animalMap.size();
        System.out.println("Total animals in the zoo: " + totalAnimals);*/


    }
}