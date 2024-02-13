import cz.engeto.ja.Computer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
       Computer computer1 = new Computer("Dell",2019,15000);
       Computer computer2 = new Computer("HP", 2014,12000);
       Computer computer3 = new Computer("Lenovo",2016,11500);

       computers.add(computer1);
       computers.add(computer2);
       computers.add(computer3);

       for (Computer computer : computers){
           System.out.println(computer.getDescription()+" "+ computer.getYearOfProduction()
           +" "+ computer.getPrice());
       }

        computers.sort(Comparator.comparing(Computer::getYearOfProduction));

       // Obecnější pro jakoukoli kolekci: Collection.sort(computers, Comparator.comparing(Computer::getPrice));

       System.out.println("\nSeřazeno podle roku výroby:\n");
       computers.forEach(System.out::println);

        computers.sort(Comparator.comparing(Computer::getPrice).reversed());

        // v základu se řadí od nejnižší hodnoty -> reverse to otočí od nejvyšší

        System.out.println("\nSeřazeno od nejvyšší ceny:\n");
        computers.forEach(System.out::println);

    }
}