package utils.enums;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String NAME;

    Gender(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }
}
