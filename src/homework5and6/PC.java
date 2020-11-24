package homework5and6;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram, boolean isPowerSupply) {
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

    public void volumeUp() {
        volumeLevel += 1;
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
        volumeLevel -= 1;
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
