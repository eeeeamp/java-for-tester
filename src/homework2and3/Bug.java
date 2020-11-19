package homework2and3;

public class Bug {

    private String description;
    private String creatorEmail;
    private int bugPriority;
    private boolean status;

    public Bug(String description, String creatorEmail, int bugPriority, boolean status) {

        this.description = description;
        this.creatorEmail = creatorEmail;
        this.bugPriority = bugPriority;
        this.status = status;
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

        if (status = true) {

            return "Open";

        } else {

            return "Close";
        }

    }

    public int priorityOfBug() {

        return bugPriority;
    }

}
