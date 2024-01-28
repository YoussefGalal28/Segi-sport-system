
package segisportsystem;

public class Facility {
    private String name;

    public Facility(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                '}';
    }
}



