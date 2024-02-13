package cz.engeto.ja;

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private final List<Computer> computers; // = new ArrayList<>();

    private int countOfMSIComputers = 0;

    public ComputerManager(List<Computer> computers){
        //this.computers.addAll(computers);
        this.computers = new ArrayList<>(computers);
        for (Computer computer : computers){
            if (computer.getDescription().equals("MSI")){
                countOfMSIComputers++;
            }
        }
    }

    public int getCountOfMSIComputers(){
        return countOfMSIComputers;
    }
    public List<Computer> getComputers(){
        return new ArrayList<>(computers);
    }
}
