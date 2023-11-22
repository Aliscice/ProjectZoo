package Project_Zoo;

import java.time.LocalDate;

public class Animals_wings extends Animals {
    private double wingSpan = 0.0;

    public Animals_wings (String nickname, String favorite_food, int age, LocalDate date_entry, double weight, double height, double wingSpan) {
        super(nickname,favorite_food,age,date_entry, weight, height);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {return wingSpan;}

    public void setWingSpan(double wingSpan) {

        this.wingSpan = wingSpan;
    }
}
