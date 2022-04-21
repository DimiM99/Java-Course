
class Employee {
    String name;
    String email;
    int experience;

    public Employee(String name, String email, int experince) {
        this.email = email;
        this.experience = experince;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getEmail() {
        return email;
    }
}

class Developer extends Employee {
    String mainLanguage;
    String[] skills;

    public Developer(String name, String email, int experince, String mainLanguage, String[] skills) {
        super(name, email, experince);
        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills.clone();
    }
}

class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;

    public DataAnalyst(String name, String email, int experince, boolean phd, String[] methods) {
        super(name, email, experince);
        this.methods = methods.clone();
        this.phd = phd;
    }

    public String[] getMethods() {
        return methods.clone();
    }

    public boolean isPhd() {
        return phd;
    }
}