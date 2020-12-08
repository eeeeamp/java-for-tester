package model.bug;

import java.util.Objects;

public class BugReporter {

    private String firstName;
    private String lastName;
    private String creatorEmail;

    public BugReporter(String firstName, String lastName, String creatorEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creatorEmail = creatorEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatorEmail() {
        return creatorEmail;
    }

    public void setCreatorEmail(String creatorEmail) {
        if (!creatorEmail.contains("@")) {
            System.out.println("Email is not correct, email should contain @ sign");
        } else {
            this.creatorEmail = creatorEmail;
        }
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", creatorEmail='" + creatorEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(creatorEmail, that.creatorEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, creatorEmail);
    }
}
