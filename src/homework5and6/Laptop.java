package homework5and6;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is to low!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Laptop " + name + " is switched off");
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public int volumeUp() {
        volumeLevel += 5;
        if (volumeLevel >= 100) {
            return volumeLevel = 100;
        } else {
            return volumeLevel += 5;
        }
    }

    @Override
    public int volumeUp(int volumeLevelCounter) {
        volumeLevel += volumeLevelCounter;
        if (volumeLevel >= 100) {
            return volumeLevel = 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeLevelCounter) {
        volumeLevel -= volumeLevelCounter;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
    }
}
