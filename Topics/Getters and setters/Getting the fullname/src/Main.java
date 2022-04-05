class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && firstName != "") {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && lastName != "") {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() == true && lastName.isEmpty() == true) {
            return "Unknown";
        } else if (firstName.isEmpty() == true) {
            return lastName;
        } else if (lastName.isEmpty() == true) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}