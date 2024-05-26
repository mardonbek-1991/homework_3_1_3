package version_2;

// Custom exceptions
class FloorCantBeLessThanZeroException extends Exception {
    public FloorCantBeLessThanZeroException(String message) {
        super(message);
    }
}

class ColorCantBeBlankException extends Exception {
    public ColorCantBeBlankException(String message) {
        super(message);
    }
}

class RoomCountCantBeLessThanTenException extends Exception {
    public RoomCountCantBeLessThanTenException(String message) {
        super(message);
    }
}

class PersonNameCantBeBlankException extends Exception {
    public PersonNameCantBeBlankException(String message) {
        super(message);
    }
}

// Home class
public class Home {
    private int floor;
    private String color;
    private int roomCount;
    private String personName;

    public Home(int floor, String color, int roomCount, String personName)
            throws FloorCantBeLessThanZeroException,
            ColorCantBeBlankException,
            RoomCountCantBeLessThanTenException,
            PersonNameCantBeBlankException {

        if (floor < 0) {
            throw new FloorCantBeLessThanZeroException("Floor can't be less than zero.");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new ColorCantBeBlankException("Color can't be blank.");
        }
        if (roomCount < 10) {
            throw new RoomCountCantBeLessThanTenException("Room count can't be less than ten.");
        }
        if (personName == null || personName.trim().isEmpty()) {
            throw new PersonNameCantBeBlankException("Person name can't be blank.");
        }

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

    public static void main(String[] args) {
        try {
            // Attempt to create a Home object with invalid values to demonstrate exceptions
            Home home = new Home(-1, "", 5, null);
            System.out.println("Home created: " + home.getFloor() + ", " + home.getColor() + ", " + home.getRoomCount() + ", " + home.getPersonName());
        } catch (FloorCantBeLessThanZeroException | ColorCantBeBlankException | RoomCountCantBeLessThanTenException | PersonNameCantBeBlankException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

