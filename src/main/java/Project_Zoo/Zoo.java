package Project_Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Zoo  {
    public List<Lions> lionsList;
    public List<Tigers> tigersList;
    public List<Eagles> eaglesList;

    public Zoo() {
        this.lionsList = new ArrayList<>();
        this.tigersList = new ArrayList<>();
        this.eaglesList = new ArrayList<>();
    }


    // AGGIUNGO GLI ANIMALI ALLO ZOO //
    public void addLion(Lions lions){
        lionsList.add(lions);
    }
    public void addTiger(Tigers tigers){
        tigersList.add(tigers);
    }
    public void addEagle(Eagles eagles){
        eaglesList.add(eagles);
    }

    // RICERCA ESEMPLARE ALTO //
    public Lions highestLion(){
        Lions highest = lionsList.getFirst();
        for(Lions lions : lionsList ){
            if(lions.getHeight() > highest.getHeight()){
                highest = lions;
            }
        }
        return  highest;
    }
    public Tigers highestTiger(){
        Tigers highest = tigersList.getFirst();
        for(Tigers tigers : tigersList ){
            if(tigers.getHeight() > highest.getHeight()){
                highest = tigers;
            }
        }
        return  highest;
    }

    public Eagles highestEagle(){
        Eagles highest = eaglesList.getFirst();
        for(Eagles eagles : eaglesList ){
            if(eagles.getHeight() > highest.getHeight()){
                highest = eagles;
            }
        }
        return  highest;
    }

    // RICERCA ESEMPLARE BASSO //
    public Lions lowestLion(){
        Lions lowest = lionsList.getFirst();
        for(Lions lions : lionsList ){
            if(lions.getHeight() < lowest.getHeight()){
                lowest = lions;
            }
        }
        return lowest;
    }

    public Tigers  lowestTiger(){
        Tigers lowest = tigersList.getFirst();
        for(Tigers tigers : tigersList ){
            if(tigers.getHeight() < lowest.getHeight()){
                lowest = tigers;
            }
        }
        return  lowest;
    }

    public Eagles lowestEagle(){
        Eagles lowest = eaglesList.getFirst();
        for(Eagles eagles : eaglesList ){
            if(eagles.getHeight() < lowest.getHeight()){
                lowest = eagles;
            }
        }
        return  lowest;
    }



    // RICERCA ESEMPLARE PIU PESANTE //
    public Lions heaviestLion(){
        Lions heviest = lionsList.getFirst();
        for(Lions lions : lionsList){
            if(lions.getWeight() > heviest.getWeight()){
                heviest = lions;
            }
        }
        return  heviest;
    }

    public Tigers heaviestTiger(){
        Tigers heviest = tigersList.getFirst();
        for(Tigers tigers : tigersList){
            if(tigers.getWeight() > heviest.getWeight()){
                heviest = tigers;
            }
        }
        return  heviest;
    }

    public Eagles heaviestEagle(){
        Eagles heviest = eaglesList.getFirst();
        for(Eagles eagles : eaglesList){
            if(eagles.getWeight() > heviest.getWeight()){
                heviest = eagles;
            }
        }
        return  heviest;
    }

    // RICERCA ESEMPLARE PIU LEGGERO //

    public Lions lighterLion(){
        Lions lighter = lionsList.getFirst();
        for(Lions lions : lionsList){
            if(lions.getWeight() < lighter.getWeight()){
                lighter = lions;
            }
        }
        return  lighter;
    }

    public Tigers lightertTiger(){
        Tigers lighter = tigersList.getFirst();
        for(Tigers tigers : tigersList){
            if(tigers.getWeight() < lighter.getWeight()){
                lighter = tigers;
            }
        }
        return  lighter;
    }

    public Eagles lighterEagle(){
        Eagles lighter = eaglesList.getFirst();
        for(Eagles eagles : eaglesList){
            if(eagles.getWeight() < lighter.getWeight()){
                lighter = eagles;
            }
        }
        return  lighter;
    }


    // CODA PIU LUNGA //

    public Animals_tails longestTail(){
        List<Animals_tails> animalsTailsList = new ArrayList<>();
        animalsTailsList.addAll(lionsList);
        animalsTailsList.addAll(tigersList);
        Animals_tails longest = animalsTailsList.getFirst();
        for (Animals_tails animalsTails : animalsTailsList){
            if(animalsTails.getTailLength() >  longest.getTailLength()){
                longest = animalsTails;
            }
        }
        return longest;
    }

    // APERTURA ALARE //
    public Animals_wings widestWingSpan(){
        List<Animals_wings> animalsWingsList = new ArrayList<>();
        animalsWingsList.addAll(eaglesList);
        Animals_wings widest = animalsWingsList.getFirst();
        for (Animals_wings animalsWings : animalsWingsList){
            if(animalsWings.getWingSpan() > widest.getWingSpan()){
                widest = animalsWings;
            }
        }
        return widest;
    }


}
