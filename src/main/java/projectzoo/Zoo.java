package projectzoo;

import java.util.*;
import java.util.stream.Collectors;


public class Zoo {

    private final List<Animal> animalList;


    public Zoo() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public Map<Class<? extends Animal>, Optional<Animal>> getTallestAnimal() {
        return animalList.stream()
                .collect(Collectors.groupingBy(Animal::getClass, Collectors.maxBy(Comparator.comparing(Animal::getHeight))));
    }

    public Map<Class<? extends Animal>, Optional<Animal>> getLowestAnimal() {
        return animalList.stream()
                .collect(Collectors.groupingBy(Animal::getClass, Collectors.minBy(Comparator.comparing(Animal::getHeight))));
    }

    public Map<Class<? extends Animal>, Optional<Animal>> getHeaviestAnimal() {
        return animalList.stream()
                .collect(Collectors.groupingBy(Animal::getClass, Collectors.maxBy(Comparator.comparing(Animal::getWeight))));
    }

    public Map<Class<? extends Animal>, Optional<Animal>> getLightestAnimal() {
        return animalList.stream()
                .collect(Collectors.groupingBy(Animal::getClass, Collectors.minBy(Comparator.comparing(Animal::getWeight))));
    }
    public Map<Class<? extends Animal>, Optional<Animal>> getLongestTailedAnimal() {
        return animalList.stream()
                .filter(TailedAnimal.class::isInstance)
                .collect(Collectors.groupingBy(Animal::getClass, Collectors.maxBy(Comparator.comparing((Animal animal) -> ((TailedAnimal) animal).getTailLength()))));
    }

    public Map<Class<? extends  Animal>, Optional<Animal>> getWidestWingspan(){
        return animalList.stream()
                .filter(WingedAnimal.class::isInstance)
                .collect(Collectors.groupingBy(Animal::getClass,Collectors.maxBy(Comparator.comparing((Animal animal) -> ((WingedAnimal) animal).getWingspan()))));
    }

}



