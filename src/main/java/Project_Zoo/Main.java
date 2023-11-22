package Project_Zoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Lions lions1 = new Lions("Nala","Ribs",4, LocalDate.of(2019,1,23),1.09,1.20,40);
        Lions lions2 = new Lions("Leo","Chicken",8, LocalDate.of(2015,4,10),1.03,1.17,36);
        Lions lions3 = new Lions("Rin","Pork",10, LocalDate.of(2013,12,5),1.10,1.28,55);

        Tigers tigers1 = new Tigers("Baghera","Meat", 3, LocalDate.of(2020,8,20),2.50,0.80,39);
        Tigers tigers2 = new Tigers("Max","Ribs", 14, LocalDate.of(2009,11,30),1.88,1.10,47);
        Tigers tigers3 = new Tigers("Kai","Pork", 8, LocalDate.of(2015,3,24),1.50,1.80,34);

        Eagles eagles1 = new Eagles("Neon","Rabbit", 30, LocalDate.of(1993,5,1),3.40,0.69,23);
        Eagles eagles2 = new Eagles("Bubi","Chicken", 30, LocalDate.of(1993,5,1),2.48,0.90,33);
        Eagles eagles3 = new Eagles("Mina","Mouse", 1, LocalDate.of(2023,6,28),1.98,0.45,13);


        Zoo zoo =  new Zoo();

        zoo.lionsList.add(lions1);
        zoo.lionsList.add(lions2);
        zoo.lionsList.add(lions3);

        zoo.tigersList.add(tigers1);
        zoo.tigersList.add(tigers2);
        zoo.tigersList.add(tigers3);

        zoo.eaglesList.add(eagles1);
        zoo.eaglesList.add(eagles2);
        zoo.eaglesList.add(eagles3);


        System.out.println("the taller lion is: " +  zoo.highestLion().getNickname());
        System.out.println("the taller tiger is: " +  zoo.highestTiger().getNickname());
        System.out.println("the taller eagle is: " +  zoo.highestEagle().getNickname());

        System.out.println("the shortes lion is: " +  zoo.lowestLion().getNickname());
        System.out.println("the shortes tiger is: " +  zoo.lowestTiger().getNickname());
        System.out.println("the shortes eagle is: " +  zoo.lowestEagle().getNickname());

        System.out.println("the heviest lion is: " +  zoo.heaviestLion().getNickname());
        System.out.println("the heviest tiger is: " +  zoo.heaviestTiger().getNickname());
        System.out.println("the heviest eagle is: " +  zoo.heaviestEagle().getNickname());

        System.out.println("the lighter lion is: " +  zoo.lighterLion().getNickname());
        System.out.println("the lighter tiger is: " +  zoo.lightertTiger().getNickname());
        System.out.println("the lighter eagle is: " +  zoo.lighterEagle().getNickname());

        System.out.println("the longest tail is: " +  zoo.longestTail().getNickname());

        System.out.println("the widest spanwing is: " +  zoo.widestWingSpan().getNickname());


    }
}