package projectzoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Lion lion1 = new Lion("Nala","Ribs",4, LocalDate.of(2019,1,23),1.09,1.20,40);
        Lion lion2 = new Lion("Leo","Chicken",8, LocalDate.of(2015,4,10),1.03,1.17,36);
        Lion lion3 = new Lion("Rin","Pork",10, LocalDate.of(2013,12,5),1.10,1.28,55);

        Tiger tiger1 = new Tiger("Baghera","Meat", 3, LocalDate.of(2020,8,20),2.50,0.80,39);
        Tiger tiger2 = new Tiger("Max","Ribs", 14, LocalDate.of(2009,11,30),1.88,1.10,47);
        Tiger tiger3 = new Tiger("Kai","Pork", 8, LocalDate.of(2015,3,24),1.50,1.80,34);

        Eagle eagle1 = new Eagle("Neon","Rabbit", 30, LocalDate.of(1993,10,18),3.40,0.69,23);
        Eagle eagle2 = new Eagle("Bubi","Chicken", 30, LocalDate.of(1993,5,1),2.48,0.90,33);
        Eagle eagle3 = new Eagle("Mina","Mouse", 1, LocalDate.of(2023,6,28),1.98,0.45,13);


        Zoo zoo =  new Zoo();

        zoo.addLion(lion1);
        zoo.addLion(lion2);
        zoo.addLion(lion3);

        zoo.addTiger(tiger1);
        zoo.addTiger(tiger2);
        zoo.addTiger(tiger3);

        zoo.addEagle(eagle1);
        zoo.addEagle(eagle2);
        zoo.addEagle(eagle3);



        System.out.println("the taller lion is: " +  zoo.getHighestLion().getNickname());
        System.out.println("the taller tiger is: " +  zoo.getHighestTiger().getNickname());
        System.out.println("the taller eagle is: " +  zoo.getHighestEagle().getNickname());

        System.out.println("the smallest lion is: " +  zoo.getLowestLion().getNickname());
        System.out.println("the smallest tiger is: " +  zoo.getLowestTiger().getNickname());
        System.out.println("the smallest eagle is: " +  zoo.getLowestEagle().getNickname());

        System.out.println("the heaviest lion is: " +  zoo.getHeaviestLion().getNickname());
        System.out.println("the heaviest tiger is: " +  zoo.getHeaviestTiger().getNickname());
        System.out.println("the heaviest eagle is: " +  zoo.getHeaviestEagle().getNickname());

        System.out.println("the lighter lion is: " +  zoo.getLighterLion().getNickname());
        System.out.println("the lighter tiger is: " +  zoo.getLighterTiger().getNickname());
        System.out.println("the lighter eagle is: " +  zoo.getLighterEagle().getNickname());

        System.out.println("the longest tail is: " +  zoo.getLongestTail().getNickname());

        System.out.println("the widest spawning is: " +  zoo.getWidestWingSpan().getNickname());


    }
}