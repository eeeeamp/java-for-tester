package homework5and6;

public class ComputerMain {

    public static void main(String[] args) {

        Laptop gamingLaptop = new Laptop("Gaming Laptop", "gaming", 500, 128, 20);
        PC officeComputer = new PC("Office PC", "office", 500, 256, false);

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
