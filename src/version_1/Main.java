package version_1;

public class Main {
    public static void main(String[] args) {
        Home home = new Home(1, "White", 16, "Mardonbek");
        createObject(home);
    }

    static void createObject(Home home) {
        try {
            floor(home);
            color(home);
            countNumber(home);
            personName(home);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void floor(Home home) throws Exception {
        if (home.getFloor() < 0) {
            throw new Exception("Floor Cant Be Less Than Zero Exception");
        }
    }

    private static void color(Home home) throws Exception {
        if (home.getColor() == null || home.getColor().isEmpty()) {
            throw new Exception("Color can not be blank exception");
        }
    }

    private static void countNumber(Home home) throws Exception {
        if (home.getRoomCount() < 10) {
            throw new Exception("Room count can not be less than 10 exception");
        }
    }

    private static void personName(Home home) throws Exception {
if (home.getPersonName()==null||home.getPersonName().isEmpty()){
    throw new Exception("Person Name can not be blank exception");
}
    }

}
