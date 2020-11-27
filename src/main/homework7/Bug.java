package homework7;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

    private static int bugCounter = 0;
    private String description;
    private int bugPriority;
    private boolean status;
    private BugReporter bugReporter;

    public Bug(String description, BugReporter bugReporter, int bugPriority, boolean status) {

        this.description = description;
        this.bugReporter = bugReporter;
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

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
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
        notifyStatusChange();
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
                ", bugPriority=" + bugPriority +
                ", status=" + statusOfBug() +
                ", bugReporter=" + bugReporter +
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
                Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, bugPriority, status, bugReporter);
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status of the bug is changed!");
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getDescription().compareTo(bug.getDescription());
        if(compareResult == 0){
            compareResult = this.getBugReporter().getCreatorEmail().compareTo(bug.getBugReporter().getCreatorEmail());
        }
        return compareResult;
    }
}
