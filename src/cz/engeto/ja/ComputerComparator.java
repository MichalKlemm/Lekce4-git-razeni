package cz.engeto.ja;

import java.util.Comparator;

public class ComputerComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        int resultDescription = o1.getDescription().compareTo(o2.getDescription());
        if (resultDescription != 0) {
            return resultDescription;
        }
        else if (o1.getYearOfProduction() != o2.getYearOfProduction()) {
            return o1.getYearOfProduction() - o2.getYearOfProduction();
        }
        else {
            return - o1.getPrice().compareTo(o2.getPrice());
        }

    }
}
