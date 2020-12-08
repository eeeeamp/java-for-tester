package model.computer;

abstract public class Computer {

    //composition - has a
    protected String name;
    protected String type;
    protected Hdd hdd; //composition
    protected Ram ram; //composition
    public boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
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

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
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

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                '}';
    }
}
