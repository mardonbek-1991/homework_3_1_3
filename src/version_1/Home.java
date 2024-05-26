package version_1;

public class Home {
    private int floor;
    private String color;
    private int roomCount;
    private String personName;

    public Home(int floor, String color, int roomCount, String personName) {
        this.floor = floor;
        this.color = color;
        this.roomCount = roomCount;
        this.personName = personName;
    }

    public int getFloor() {
        return floor;
    }

    public String getColor() {
        return color;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public String getPersonName() {
        return personName;
    }
}

