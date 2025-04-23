package com.treizer.ltc.exercise2;

import java.util.ArrayList;
import java.util.List;

public class TestVehicle {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("1111AAA", Model.BMW, 10_000));
        vehicles.add(new Vehicle("2222BBB", Model.AUDI, 20_000));
        vehicles.add(new Vehicle("3333CCC", Model.OPEL, 30_000));
        vehicles.add(new Vehicle("4444DDD", Model.BMW, 100_000));
        vehicles.add(new Vehicle("5555EEE", Model.AUDI, 200_000));
        vehicles.add(new Vehicle("6666FFF", Model.OPEL, 300_000));
        vehicles.add(new Vehicle("7777GGG", Model.CITROEN, 0));
        vehicles.add(new Vehicle("728287GGG", Model.AUDI, 90_000));

        // 1
        // System.out.println("Listar los kilómetros de cada vehículo y multiplicarlo
        // por 2");
        // List<Integer> kilometersMultiplied = vehicles.stream()
        // .map(v -> v.getKilometers() * 2)
        // .collect(Collectors.toList());
        // kilometersMultiplied.forEach(System.out::println);

        // 2
        // System.out.println("\nListart los kilómetros de todos los vehículos");
        // vehicles.stream().map(Vehicle::getKilometers)
        // .forEach(System.out::println);

        // 3
        // System.out.println("Listar los vehículos sólo con modelos AUDI");
        // vehicles.stream()
        // .filter(v -> v.getModel().equals(Model.AUDI))
        // .forEach(System.out::println);

        // 4
        // System.out.println("Ordenar los vehículos por la cantidad de kilómetros");
        // vehicles.stream()
        // .sorted((v1, v2) -> Integer.compare(v1.getKilometers(), v2.getKilometers()))
        // .forEach(System.out::println);

        // 5
        // System.out.println("Listar todos los modelos sin que se repitan");
        // vehicles.stream().map(Vehicle::getModel)
        // .distinct()
        // .forEach(System.out::println);

        // 6
        // System.out.println("Listar los vehículos con más de 20000 kilómetros e
        // imprimir el objeto");
        // List<String> result = vehicles.stream()
        // .filter(v -> v.getKilometers() > 20_000)
        // .peek(System.out::println)
        // .map(Vehicle::getCarNumber)
        // .peek(System.out::println)
        // .collect(Collectors.toList());
        // // result.forEach(System.out::println);

        // 7
        // System.out.println("Agrupar los vehículos por modelo");
        // Map<Model, List<Vehicle>> groupByModel = vehicles.stream()
        // .collect(Collectors.groupingBy(Vehicle::getModel));
        // groupByModel.forEach((k, v) -> {
        // System.out.println("Modelo: " + k);
        // v.forEach(System.out::println);
        // System.out.println();
        // });

        // 8
        // System.out.println("Sumar los kilómetros de los vehículos");
        // Integer kilometersSummation = vehicles.stream()
        // .map(Vehicle::getKilometers)
        // .reduce(0, Integer::sum);
        // System.out.println(kilometersSummation);

        // 9
        System.out.println("Listar 2 vehículos con kilómetros menores o iguales a 100,000");
        vehicles.stream().filter(v -> v.getKilometers() <= 100_000)
                // .map(Vehicle::getModel)
                // .distinct()
                .limit(2)
                .forEach(System.out::println);
    }

}
