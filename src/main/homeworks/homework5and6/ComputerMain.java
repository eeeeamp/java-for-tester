package homeworks.homework5and6;

import model.computer.Hdd;
import model.computer.Laptop;
import model.computer.PC;
import model.computer.Ram;

public class ComputerMain {

    public static void main(String[] args) {

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 256);

        Laptop gamingLaptop = new Laptop("Gaming Laptop", "gaming", hdd, ram, 20);
        PC officeComputer = new PC("Office PC", "office", hdd, ram, false);

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.state);

        gamingLaptop.switchOff();
        System.out.println(gamingLaptop.state);

        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.state);

        officeComputer.switchOn();
        System.out.println(officeComputer.state);

        officeComputer.switchOff();
        System.out.println(officeComputer.state);

        officeComputer.changePowerSupply(false);
        officeComputer.switchOn();

    }
}
