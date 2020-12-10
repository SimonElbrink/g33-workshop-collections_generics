package se.lexicon;

import se.lexicon.model.Car;
import se.lexicon.model.Saab;
import se.lexicon.model.Volvo;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

        arrayList();
        hashSet();
        hashMap();
        HashMap2();
    }

    public static void arrayList(){
        List<Car> carStorage = new ArrayList<>();

        carStorage.addAll(Arrays.asList(new Volvo( "V70", 9001), new Car("Tesla", "Model 3")));

        for ( Car aCar: carStorage) {
            System.out.println(aCar);
        }

        System.out.println("--------------------------");
    }

    public static void hashSet(){

        Car bmw = new Car("BMW", "M3");
        Volvo volvo = new Volvo("V70", 9001);

        Set<Car> carStorage = new HashSet<>();

        carStorage.add(bmw);
        carStorage.add(volvo);

        for ( Car aCar: carStorage) {
            System.out.println(aCar);
        }

        System.out.println("--------------------------");
    }

    public static void hashMap(){
        Car bmw = new Car("BMW", "M3");
        Volvo volvo = new Volvo("V70", 9001);
        Saab saab = new Saab("95", 150);

        Map<Integer, Car> carStorage = new HashMap<>();

        carStorage.put(1,bmw);
        carStorage.put(2,volvo);
        carStorage.put(3,saab);

        for ( Integer key: carStorage.keySet()) {
            System.out.print("Key: " + key);
            System.out.println(", Value: " + carStorage.get(key));
        }

        System.out.println("--------------------------");

        for (Car aCar : carStorage.values()){
            System.out.println(aCar);
        }

        System.out.println("--------------------------");
    }

    public static void HashMap2(){
        Car bmw = new Car("BMW", "M3");
        Car bmw2 = new Car("BMW", "e30");
        Car bmw3 = new Car("BMW", "M5");

        Set<Car> bmws = new HashSet<>(Arrays.asList(bmw, bmw2, bmw3));

        Saab saab = new Saab("95", 150);
        Set<Car> saabs = new HashSet<Car>(Arrays.asList(saab));

        Set<Car> volvos = new HashSet<Car>(Arrays.asList(
                new Volvo("V70", 9001),
                new Volvo("XC70", 10000)
        ));


        Map<String,Set<Car>> carStorage = new HashMap<>();

        carStorage.put("BMW", bmws);
        carStorage.put("VOLVO", volvos);
        carStorage.put("SAAB", saabs);


        for ( String key: carStorage.keySet()) {
            System.out.print("Key: " + key);
            System.out.println(", Value: " + carStorage.get(key));
        }
        System.out.println("--------------------------");
    }


}




