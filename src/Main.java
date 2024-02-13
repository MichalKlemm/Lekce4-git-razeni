import cz.engeto.ja.Computer;

import java.util.ArrayList;
import java.util.List;

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
    }
}