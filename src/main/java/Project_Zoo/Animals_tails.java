package Project_Zoo;

import java.time.LocalDate;

public class Animals_tails extends Animals {
    public double tailLength = 0.0;
    public Animals_tails(String nickname, String favorite_food, int age, LocalDate date_entry, double weight, double height, double tailLength) {
        super(nickname,favorite_food,age,date_entry, weight, height);
        this.tailLength = tailLength;
    }


    public double getTailLength() {return tailLength;}

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
