package projectzoo;

import java.time.LocalDate;

public class WingedAnimals extends Animals {
    private double wingspan;

    public WingedAnimals(String nickname, String favoriteFood, int age, LocalDate dateEntry, double weight, double height, double wingspan) {
        super(nickname,favoriteFood,age,dateEntry, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {return wingspan;}

    public void setWingspan(double wingspan) {

        this.wingspan = wingspan;
    }
}