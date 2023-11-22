package Project_Zoo;

import java.time.LocalDate;

public class Animals  {
    public String nickname;
    public String favorite_food;
    public int age;
    public LocalDate date_entry;
    public double weight;
    public double height;


    public Animals(String nickname, String favorite_food, int age, LocalDate date_entry, double weight, double height){
    this.nickname = nickname;
    this.favorite_food = favorite_food;
    this.age = age;
    this.date_entry = date_entry;
    this.weight = weight;
    this.height = height;
}

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFavorite_food() {return favorite_food;}

    public void setFavorite_food(String favorite_food) {
        this.favorite_food = favorite_food;
    }

    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate_entry() {return date_entry;}

    public void setDate_entry(LocalDate date_entry) {
    this.date_entry = date_entry;
    }

    public double getWeight() {return weight;}

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {return height;}

    public void setHeight(double height) {
        this.height = height;
    }
}
