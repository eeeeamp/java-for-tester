package homework5and6;

public class ComputerAbstractMain {

    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office Computer Emilia", "Dell", 500, 128, true);
        Computer officeComputer2 = new PC("Office Computer Kamil", "Dell", 500, 128, true);
        Computer officeComputer3 = new PC("Office Computer Piotr", "HP", 500, 256, true);
        Computer msi = new Laptop("msi Prestige", "msi", 500, 256, 90);
        Computer macbook = new Laptop("MB Pro", "PRO", 500, 256, 50);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, msi, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        ((Laptop) msi).setBatteryLevel(30);
        System.out.println(((Laptop) msi).getBatteryLevel());

        System.out.println("Changing volume level tests - Laptop");
        System.out.println(msi.volumeUp(50));
        System.out.println(msi.volumeUp(48));
        System.out.println(msi.volumeUp(500)); //100
        System.out.println(msi.volumeUp()); //102
        System.out.println(msi.volumeDown(98));
        System.out.println(msi.volumeDown());

        System.out.println("Changing volume level tests - PC");
        System.out.println(officeComputer2.volumeUp(50));
        System.out.println(officeComputer2.volumeUp(49));
        System.out.println(officeComputer2.volumeUp());
        System.out.println(officeComputer2.volumeUp(700));
        System.out.println(officeComputer2.volumeDown(99));
        System.out.println(officeComputer2.volumeDown());

    }
}
