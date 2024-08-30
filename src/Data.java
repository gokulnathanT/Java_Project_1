public class Data {

    private String name;
    private int id;
    private String place;
    private int rank;

    public Data() {
    }

    public Data(String n, int id, String place, int rank) {
        this.name = n;
        this.id = id;
        this.place = place;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", place='" + place + '\'' +
                ", rank=" + rank +
                '}';
    }
}
