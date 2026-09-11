package country;

public class Country {
    private String name;
    private String system;

    public Country() {
    }

    public Country(String name, String system) {
        this.name = name;
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", system='" + system + '\'' +
                '}';
    }
}
