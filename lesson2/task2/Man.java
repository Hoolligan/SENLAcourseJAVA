public class Man {
    protected String name;
    protected String surname;

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Man");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
