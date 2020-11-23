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
