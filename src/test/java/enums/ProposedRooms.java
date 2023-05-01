package enums;

public enum ProposedRooms {
    ONE("1"), TWO("2"), THREE("3"), FOUR("> 3");
    private final String name;

    ProposedRooms(String name) {
        this.name = name;
    }

    public static ProposedRooms fromString(String value) {
        for (ProposedRooms proposedRooms : ProposedRooms.values()) {
            if (proposedRooms.getName().equals(value)) {
                return proposedRooms;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
