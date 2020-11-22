package homework5;

public class PC extends Computer{

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

    public void changePowerSupply(boolean newStateOfPowerSupply){
        this.isPowerSupply = newStateOfPowerSupply;
    }
}
