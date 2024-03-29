import cz.engeto.ja.Computer;
import cz.engeto.ja.ComputerComparator;
import cz.engeto.ja.ComputerManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    // pokus


    public static  void main(String[] args){
        List<Computer> defaultList = new ArrayList<>();
        defaultList.add(new Computer("MSI", 2018, 17500));
        defaultList.add(new Computer("MSI", 2017, 16980));
        ComputerManager manager = new ComputerManager(defaultList);

        //defaultList.add(new Computer("MSI", 2017, 16980)); tohle mi nefunguje pro výpis

        System.out.println(manager.getCountOfMSIComputers());
        manager.getComputers().forEach(System.out::println);
    }

    private static void pokus(){

    }

    public static void mainSortTest() {

        List<Computer> computers = new ArrayList<>();
       Computer computer1 = new Computer("Dell",2019,15000);
       Computer computer2 = new Computer("HP", 2014,12000);
       Computer computer3 = new Computer("Lenovo",2016,11500);
       Computer computer4 = new Computer("MSI",2018,18500);
       Computer computer5 = new Computer("MSI",2018,21500);
       Computer computer6 = new Computer("Razer",2022,42900);

       computers.addAll(List.of(computer1,computer2,computer3,computer4,computer5,computer6));
//       computers.add(computer2);
//       computers.add(computer3);
//       computers.add(computer4);
//       computers.add(computer5);
//       computers.add(computer6);

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

        Collections.sort(computers);
        System.out.println("\nSeřazeno podle popisu\n");
        computers.forEach(System.out::println);

        computers.sort(new ComputerComparator());
        System.out.println("\nSeřazeno podle mého vlastního komparátoru\n");
        computers.forEach(System.out::println);

    }
}