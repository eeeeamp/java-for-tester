package homework9;

import homework5and6.*;
import jdk.jfr.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ComputersListTest {

//    1. Zliczyć wszystkie komputery, które maja więcej niż 128 GB ramu
//    2. Wyświetlic na konsole, wszystkie typy komputerow - map
//    3. Wyswietlic komputer, ktory ma najwiecej ramu
//    4. Utworzyc nowa kolekcje z komputerami, ktore maja dysk twardy mniejszy niz 500 GB
//    5. Posortowac komputery po nazwie i typie
//    6. Przecwiczyc optional
//    get()
//    isPresent()
//    isEmpty()
//    orElse()
//    orElseGet()
//    orElseThrow()
//    ifPresent()
//    ifPresentOrElse()

    static List<Computer> computers;
    String exception = "Computer does not exist";

    @BeforeAll
    static void setUp() {

        computers = new ArrayList<>();

        computers.add(new Laptop("MSI Prestige", "notebook", new Hdd("msi", 500), new Ram("msi", 256), 100));
        computers.add(new Laptop("MSI", "workbook", new Hdd("msi", 500), new Ram("msi", 128), 100));
        computers.add(new Laptop("MB PRO", "PRO", new Hdd("HP", 256), new Ram("msi", 128), 100));
        computers.add(new Laptop("MB PRO", "PRO1", new Hdd("HP", 256), new Ram("msi", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO", new Hdd("HP", 500), new Ram("msi", 256), 100));
        computers.add(new Laptop("MB PRO 3", "PRO", new Hdd("HP", 500), new Ram("msi", 256), 100));
        computers.add(new PC("Office Emilka", "AAA", new Hdd("HP", 256), new Ram("msi", 128), true));
        computers.add(new PC("Office Kamil", "AAA", new Hdd("HP", 256), new Ram("msi", 256), true));
        computers.add(new PC("Office Piotr", "BBB", new Hdd("HP", 500), new Ram("msi", 256), true));

    }

    @Name("Number of Computers with Ram size higher than 128")
    @Test
    void numberOfComputersInListIsCorrect() {

        long computersWithRamMoreThan128 = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();

        assertEquals(5, computersWithRamMoreThan128);

    }

    @Name("Display all computer types and check the number of elements")
    @Test
    void numberOfComputerTypesIsCorrect() {

        Set<String> computerTypes = computers.stream()
                .map(Computer::getType)
                .collect(Collectors.toSet());

        System.out.println(computerTypes);

        assertEquals(6, computerTypes.size());

    }

    @Name("Display all computers with the highest RAM size and check if the number is correct")
    @Test
    void numberOfComputersWithMaxRamIsCorrect() {

        Integer maxRam = computers.stream()
                .map(computer -> computer.getRam().getSize())
                .max(Integer::compareTo)
                .orElse(-1);

        List<String> computersWithMaxRam = computers.stream()
                .filter(computer -> computer.getRam().getSize() == maxRam)
                .map(Computer::getName)
                .collect(Collectors.toList());

        System.out.println(computersWithMaxRam);

        assertEquals(5, computersWithMaxRam.size());

    }

    @Name("List of computers with HDD size less than 500")
    @Test
    void numberOfComputersIsCorrect() {

        List<Computer> computersWithHddLessThan500 = computers.stream()
                .filter(computer -> computer.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        assertEquals(4, computersWithHddLessThan500.size());

    }

    @Name("Check if computers are sorted correctly")
    @Test
    void listOfComputersIsSorted() {

        List<Computer> sortedComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        assertEquals("MB PRO", sortedComputers.get(0).getName());
        assertEquals("PRO1", sortedComputers.get(1).getType());

    }

    @Test
    void practiceIsPresentMethod() {

        Optional<Computer> withMaxRamSize = computers.stream()
                .max(Comparator.comparingInt(computer -> computer.getRam().getSize()));

        //    get() //    isPresent()
        if (withMaxRamSize.isPresent()) {
            System.out.println(withMaxRamSize.get());
        } else {
            System.out.println("Computer does not exist");
        }

        assertEquals("MSI Prestige", withMaxRamSize.get().getName());

    }

    @Test
    void practiceIsEmptyMethod() {

        boolean kNameComputer = computers.stream()
                .map(Computer::getName)
                .filter(computer -> computer.startsWith("K"))
                .collect(Collectors.toList())
                .isEmpty();

        System.out.println(kNameComputer);

        assertTrue(kNameComputer);

    }

    @Test
    void practiceOrElse() {

        String bNameComputer = computers.stream()
                .map(Computer::getName)
                .filter(computer -> computer.startsWith("B"))
                .findFirst()
                .orElse(exception);

        System.out.println(bNameComputer);

        assertEquals(exception, bNameComputer);

    }

    @Test
    void practiceOrElseGet() {

        Computer newComputer = computers.stream()
                .filter(computer -> computer.getName().startsWith("C"))
                .findFirst()
                .orElseGet(() -> new Laptop("Chromebook", "Tablet", new Hdd("CCC", 500), new Ram("CCC", 256), 100));

        System.out.println(newComputer);

        assertEquals("Chromebook", newComputer.getName());

    }

    @Test
    void practiceOrElseThrow() throws Throwable {

        Throwable expectedException = new IllegalStateException(exception);

        Computer dNameComputer = computers.stream()
                .filter(computer -> computer.getName().startsWith("D"))
                .findFirst()
                .orElseThrow(() -> expectedException);

        assertEquals(exception, expectedException.getMessage());

    }

    @Test
    void practiceIfPresent() {

        computers.stream()
                .map(computer -> computer.getName().contains("Office"))
                .findFirst()
                .ifPresent(System.out::println);

    }

    @Test
    void practiceIfPresentOrElse() {

        computers.stream()
                .filter(computer -> computer.getName().contains("Bla"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println(exception));

    }

}




