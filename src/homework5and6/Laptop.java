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
    public void volumeUp() {
        volumeLevel += 5;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
    }

    @Override
    public void volumeUp(int volumeChanger) {
        if (volumeChangerValidator(volumeChanger)) {
            volumeLevel += volumeChanger;
            if (volumeLevel >= 100) {
                volumeLevel = 100;
            }
        }
    }

    @Override
    public void volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
    }

    @Override
    public void volumeDown(int volumeChanger) {
        if (volumeChangerValidator(volumeChanger)) {
            volumeLevel -= volumeChanger;
            if (volumeLevel <= 0) {
                volumeLevel = 0;
            }
        }
    }
}
