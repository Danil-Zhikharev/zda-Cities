import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class City {
    private final String name;
    private final List<Path> paths;

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public void addPath(City city, int cost) {
        for (Path path : paths) {
            if (path.getDestination().equals(city)) {
                System.out.println("Error: path from city " + this.getName() + " to city " + city.getName() + "-" + path.getCost() + " already exists");
                return;
            }
        }
        this.paths.add(new Path(city, cost));
    }

    public void removePath(City city) {
        Iterator<Path> iterator = paths.iterator();
        while (iterator.hasNext()) {
            Path path = iterator.next();
            if (path.getDestination().equals(city)) {
                iterator.remove();
                System.out.println("Successful removal. The path from city " + this.getName() + " to city " + city.getName() + "-" + path.getCost() + " has been removed");
                return;
            }
        }
        System.out.println("Error: path is not removed. No found path from city " + this.getName() + " to city " + city.getName());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" connected to: ");
        for (int i = 0; i < paths.size(); i++) {
            Path path = paths.get(i);
            sb.append(path.getDestination().getName()).append("-").append(path.getCost());
            if (i < paths.size() - 1) {
                sb.append("; ");
            }
        }
        return sb.toString();
    }


    public String getName() {
        return name;
    }

    public List<Path> getPaths() {
        return paths;
    }

    class Path {
        private City destination;
        private int cost;

        public Path(City destination, int cost) {
            this.destination = destination;
            this.cost = cost;
        }

        public City getDestination() {
            return destination;
        }

        public int getCost() {
            return cost;
        }
    }
}