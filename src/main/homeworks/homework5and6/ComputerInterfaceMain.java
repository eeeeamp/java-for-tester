package homeworks.homework5and6;

import model.computer.Hdd;
import model.computer.Laptop;
import model.computer.Ram;

public class ComputerInterfaceMain {

    public static void main(String[] args) {

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 256);

        Laptop laptop = new Laptop("Dell", "Gaming", hdd, ram, 60);
        laptop.playMusic();
        laptop.pauseMusic();
        laptop.stopMusic();

        laptop.sayHello();

        laptop.playVideo();
        laptop.stopVideo();
        laptop.pauseVideo();
        laptop.sayHello();

        //boxing
        Integer number = 10;
        // unboxing

        int newNumber = number.intValue();
    }
}
