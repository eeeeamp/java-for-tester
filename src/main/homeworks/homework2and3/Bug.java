package homeworks.homework2and3;

import java.util.Objects;

public class Bug {

    private static int bugCounter = 0;
    private String description;
    private String creatorEmail;
    private int bugPriority;
    private boolean status;

    public Bug(String description, String creatorEmail, int bugPriority, boolean status) {

        this.description = description;
        this.creatorEmail = creatorEmail;
        this.bugPriority = bugPriority;
        this.status = status;
        bugCounter++;
    }

    public static int getBugCounter() {
        return bugCounter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        if (description.length() < 10) {
            System.out.println("Description must be at least 10 characters long ");
        } else {
            this.description = description;
        }
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

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority < 1 || bugPriority > 5) {
            System.out.println("Bug priority must be between 1 and 5");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void presentAllInfo() {
        System.out.println("Please find all information about created bug: " + description + " " + creatorEmail
                + " " + bugPriority + " " + statusOfBug());
    }

    public void presentCreatorEmail() {
        System.out.println("Bug was created by: " + creatorEmail);
    }

    public String statusOfBug() {
        if (status) {
            return "Open";
        } else {
            return "Closed";
        }
    }

    public int priorityOfBug() {
        return bugPriority;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", creatorEmail='" + creatorEmail + '\'' +
                ", bugPriority=" + bugPriority +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority &&
                status == bug.status &&
                Objects.equals(description, bug.description) &&
                Objects.equals(creatorEmail, bug.creatorEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, creatorEmail, bugPriority, status);
    }
}
