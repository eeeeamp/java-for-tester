package homeworks.homework5and6;

import model.computer.*;

public class ComputerAbstractMain {

    public static void main(String[] args) {

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 256);

        Computer officeComputer1 = new PC("Office Computer Emilia", "Dell", hdd, ram, true);
        Computer officeComputer2 = new PC("Office Computer Kamil", "Dell", hdd, ram, true);
        Computer officeComputer3 = new PC("Office Computer Piotr", "HP", hdd, ram, true);
        Computer msi = new Laptop("msi Prestige", "msi", hdd, ram, 90);
        Computer macbook = new Laptop("MB Pro", "PRO", hdd, ram, 50);

        System.out.println(msi.getRam().getSize());

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, msi, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        ((Laptop) msi).setBatteryLevel(30);
        System.out.println(((Laptop) msi).getBatteryLevel());

        System.out.println("Changing volume level tests - Laptop");
        msi.volumeUp(50);
        msi.displayVolumeLevel();
        msi.volumeUp(48);
        msi.displayVolumeLevel();
        msi.volumeUp(-48);
        msi.displayVolumeLevel();
        msi.volumeUp(500);
        msi.displayVolumeLevel();
        msi.volumeDown(-895);
        msi.displayVolumeLevel();
        msi.volumeDown(99);
        msi.displayVolumeLevel();
        msi.volumeDown();
        msi.displayVolumeLevel();

        System.out.println("Changing volume level tests - PC");
        officeComputer2.volumeUp(50);
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeUp(-700);
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeUp(49);
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeUp();
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeUp(700);
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeDown(99);
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeDown(-99);
        officeComputer2.displayVolumeLevel();
        officeComputer2.volumeDown();
        officeComputer2.displayVolumeLevel();

    }
}
