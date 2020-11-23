package homework5and6;

abstract public class Computer {

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("Computer is switched on");
        this.state = true;
    }

    public void switchOff() {
        System.out.println("Computer " + name + " is switched off");
        this.state = false;
    }

    public abstract void volumeUp();

    public abstract void volumeUp(int volumeLevelCounter);

    public abstract void volumeDown();

    public abstract void volumeDown(int volumeLevelCounter);

    public void displayVolumeLevel() {
        System.out.println("Current volume level is: " + volumeLevel);
    }

    protected boolean volumeChangerValidator(int volumeChanger) {
        if (volumeChanger > 0) {
            return true;
        } else {
            System.out.print("Volume changer must be positive.");
            return false;
        }
    }
}
