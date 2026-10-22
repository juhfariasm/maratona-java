package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarsByColor(cars, "Green"));
        System.out.println(filterCarsByColor(cars, "Red"));
        System.out.println("------------------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar (List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("Green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;

    }

    private static List<Car> filterRedCar (List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("Red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;

    }

    private static List<Car> filterCarsByColor (List<Car> cars, String cor){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)){
                filteredCar.add(car);
            }
        }
        return filteredCar;

    }

    private static List<Car> filterByYearBefore (List<Car> cars, int year){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;

    }
}
