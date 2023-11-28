package projectzoo;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo =  new Zoo();

        Lion lion1 = new Lion("Nala","Ribs",4, LocalDate.of(2019,1,23),1.09,1.28,40);
        Lion lion2 = new Lion("Leo","Chicken",8, LocalDate.of(2015,4,10),1.03,1.17,36);
        Lion lion3 = new Lion("Rin","Pork",10, LocalDate.of(2013,12,5),1.10,1.20,55);

        Tiger tiger1 = new Tiger("Baghera","Meat", 3, LocalDate.of(2020,8,20),2.50,0.80,39);
        Tiger tiger2 = new Tiger("Max","Ribs", 14, LocalDate.of(2009,11,30),1.88,1.10,47);
        Tiger tiger3 = new Tiger("Kai","Pork", 8, LocalDate.of(2015,3,24),1.50,1.80,34);

        Eagle eagle1 = new Eagle("Neon","Rabbit", 30, LocalDate.of(1993,10,18),3.40,0.69,23);
        Eagle eagle2 = new Eagle("Bubi","Chicken", 30, LocalDate.of(1993,5,1),2.48,0.90,33);
        Eagle eagle3 = new Eagle("Mina","Mouse", 1, LocalDate.of(2023,6,28),1.98,0.45,13);

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        zoo.addAnimal(tiger1);
        zoo.addAnimal(tiger2);
        zoo.addAnimal(tiger3);

        zoo.addAnimal(eagle1);
        zoo.addAnimal(eagle2);
        zoo.addAnimal(eagle3);

        Map<Class<? extends Animal>, Optional<Animal>> tallestAnimal = zoo.getTallestAnimal();
        tallestAnimal.entrySet().stream().map(entry -> "the tallest " +entry.getKey().getSimpleName() + " is " + entry.getValue().get().getNickname()).forEach(System.out::println);

        Map<Class<? extends Animal>, Optional <Animal>> lowestAnimal = zoo.getLowestAnimal();
        lowestAnimal.entrySet().stream().map(entry -> "The lowest " + entry.getKey().getSimpleName() + " is " + entry.getValue().get().getNickname()).forEach(System.out::println);

        Map<Class<? extends Animal>, Optional <Animal>> lightestAnimal = zoo.getLightestAnimal();
        lightestAnimal.entrySet().stream().map(entry-> "the lightest " + entry.getKey().getSimpleName() + " is " + entry.getValue().get().getNickname()).forEach(System.out::println);

        Map<Class<? extends Animal>, Optional <Animal>> heaviestAnimal = zoo.getHeaviestAnimal();
        heaviestAnimal.entrySet().stream().map(entry -> "the heaviest "+ entry.getKey().getSimpleName() + " is " + entry.getValue().get().getNickname()).forEach(System.out::println);
        // If a value is present, returns the value, otherwise throws NoSuchElementException -> .get().

        Map<Class<? extends Animal>, Optional<Animal>> longestTailedAnimals = zoo.getLongestTailedAnimal();
        longestTailedAnimals.values().stream().map(animal -> "the longest tailed animal is " + animal.get().getNickname()).limit(1).forEach(System.out::println);

        Map<Class<? extends Animal>, Optional<Animal>> widestWingspanAnimal = zoo.getWidestWingspan();
        widestWingspanAnimal.values().stream().map(animal -> "The widest wingspan animal is " + animal.get().getNickname()).limit(1).forEach(System.out::println);



    }
}