public class Wilder {
    // attibuts
    private String firstname;
    private boolean aware;

    // constructeur
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // méthode whoAmI
    public String whoAmI() {
        if (aware == true) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware.";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware.";
        }
    }
}
