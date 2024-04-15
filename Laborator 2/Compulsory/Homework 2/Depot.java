public class Depot {

    private String name;

    public Depot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Depot depot = (Depot) obj;
        return name.equals(depot.name);
    }

    @Override
    public String toString() {
        return "Depot{" +
                "name='" + name + '\'' +
                '}';
    }
}
