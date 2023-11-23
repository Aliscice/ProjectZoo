package projectzoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Lion> lionList;
    private final List<Tiger> tigerList;
    private final List<Eagle> eagleList;


    public Zoo() {
        this.lionList = new ArrayList<>();
        this.tigerList = new ArrayList<>();
        this.eagleList = new ArrayList<>();
    }

    public void addLion(Lion lion){
        lionList.add(lion);
    }
    public void addTiger(Tiger tiger){
        tigerList.add(tiger);
    }
    public void addEagle(Eagle eagle){
        eagleList.add(eagle);
    }

    // RICERCA ESEMPLARE PIU ALTO //

    public Lion getHighestLion(){
        Lion currentHighestLion = lionList.getFirst();
        for(Lion lion : lionList){
            if(lion.getHeight() > currentHighestLion.getHeight()){
                currentHighestLion = lion;
            }
        }
        return  currentHighestLion;
    }

    public Tiger getHighestTiger(){
        Tiger currentHighestTiger = tigerList.getFirst();
        for(Tiger tiger : tigerList){
            if(tiger.getHeight() > currentHighestTiger.getHeight()){
                currentHighestTiger = tiger;
            }
        }
        return  currentHighestTiger;
    }

    public Eagle getHighestEagle(){
        Eagle currentHighestEagle = eagleList.getFirst();
        for(Eagle eagle : eagleList){
            if(eagle.getHeight() > currentHighestEagle.getHeight()){
                currentHighestEagle = eagle;
            }
        }
        return  currentHighestEagle;
    }

    // RICERCA ESEMPLARE PIU BASSO //
    public Lion getLowestLion(){
        Lion currentLowestLion = lionList.getFirst();
        for(Lion lion : lionList){
            if(lion.getHeight() < currentLowestLion.getHeight()){
                currentLowestLion = lion;
            }
        }
        return currentLowestLion;
    }

    public Tiger getLowestTiger(){
        Tiger currentLowestTiger = tigerList.getFirst();
        for(Tiger tiger : tigerList){
            if(tiger.getHeight() < currentLowestTiger.getHeight()){
                currentLowestTiger = tiger;
            }
        }
        return  currentLowestTiger;
    }

    public Eagle getLowestEagle(){
        Eagle currentLowestEagle = eagleList.getFirst();
        for(Eagle eagle : eagleList){
            if(eagle.getHeight() < currentLowestEagle.getHeight()){
                currentLowestEagle = eagle;
            }
        }
        return  currentLowestEagle;
    }


    // RICERCA ESEMPLARE PIU PESANTE //
    public Lion getHeaviestLion(){
        Lion currentHeviestLion = lionList.getFirst();
        for(Lion lion : lionList){
            if(lion.getWeight() > currentHeviestLion.getWeight()){
                currentHeviestLion = lion;
            }
        }
        return  currentHeviestLion;
    }

    public Tiger getHeaviestTiger(){
        Tiger currentHeviestTiger = tigerList.getFirst();
        for(Tiger tiger : tigerList){
            if(tiger.getWeight() > currentHeviestTiger.getWeight()){
                currentHeviestTiger = tiger;
            }
        }
        return  currentHeviestTiger;
    }

    public Eagle getHeaviestEagle(){
        Eagle currentHeviestEagle = eagleList.getFirst();
        for(Eagle eagle : eagleList){
            if(eagle.getWeight() > currentHeviestEagle.getWeight()){
                currentHeviestEagle = eagle;
            }
        }
        return  currentHeviestEagle;
    }

    // RICERCA ESEMPLARE PIU LEGGERO //

    public Lion getLighterLion(){
        Lion currentLighterLion = lionList.getFirst();
        for(Lion lion : lionList){
            if(lion.getWeight() < currentLighterLion.getWeight()){
                currentLighterLion = lion;
            }
        }
        return  currentLighterLion;
    }

    public Tiger getLighterTiger(){
        Tiger currentLighterLion = tigerList.getFirst();
        for(Tiger tiger : tigerList){
            if(tiger.getWeight() < currentLighterLion.getWeight()){
                currentLighterLion = tiger;
            }
        }
        return  currentLighterLion;
    }

    public Eagle getLighterEagle(){
        Eagle currentLighterEagle = eagleList.getFirst();
        for(Eagle eagle : eagleList){
            if(eagle.getWeight() < currentLighterEagle.getWeight()){
                currentLighterEagle = eagle;
            }
        }
        return  currentLighterEagle;
    }


    // ESEMPLARE CON LA  CODA PIU LUNGA //

    public TailedAnimal getLongestTail(){
        List<TailedAnimal> tailedAnimalList = new ArrayList<>();
        tailedAnimalList.addAll(lionList);
        tailedAnimalList.addAll(tigerList);
        TailedAnimal currentLongestTail = tailedAnimalList.getFirst();
        for (TailedAnimal tailedAnimal : tailedAnimalList){
            if(tailedAnimal.getTailLength() >  currentLongestTail.getTailLength()){
                currentLongestTail = tailedAnimal;
            }
        }
        return currentLongestTail;
    }

    // ESEMPLARE CON L'APERTURA ALARE PIU GRANDE //
    public WingedAnimals getWidestWingSpan(){
        List<WingedAnimals> animalsWingsList = new ArrayList<>(eagleList);
        WingedAnimals currentWidestWingSpan = animalsWingsList.getFirst();
        for (WingedAnimals animalsWings : animalsWingsList){
            if(animalsWings.getWingspan() > currentWidestWingSpan.getWingspan()){
                currentWidestWingSpan = animalsWings;
            }
        }
        return currentWidestWingSpan;
    }


}
