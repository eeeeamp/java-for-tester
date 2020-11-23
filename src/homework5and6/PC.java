package homework5and6;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram, boolean isPowerSupply) {
        super(name, type, hdd, ram);
        this.isPowerSupply = isPowerSupply;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("Power supply is missing, computer will not be switched on!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("PC " + name + " is switched off");
        state = false;
    }

    public void changePowerSupply(boolean newStateOfPowerSupply) {
        this.isPowerSupply = newStateOfPowerSupply;
    }

    public int volumeUp() {
        volumeLevel += 1;
        if (volumeLevel >= 100) {
            return volumeLevel = 100;
        } else {
            return volumeLevel;
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
        volumeLevel -= 1;
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
