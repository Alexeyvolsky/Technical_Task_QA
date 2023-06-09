package enums;

public enum FloorsOfHouse {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    FOURTH("4"),
    FIFTH("5"),
    SIXTH("6"),
    SEVENTH("7"),
    EIGHTH("8"),
    NINTH("9"),
    TENTH("10"),
    ELEVENTH("11"),
    TWELFTH("12"),
    THIRTEENTH("13"),
    FOURTEENTH("14"),
    FIFTEENTH("15"),
    SIXTEENTH("16"),
    SEVENTEENTH("17"),
    EIGHTEENTH("18"),
    NINETEENTH("19"),
    TWENTIETH("20"),
    TWENTYFIRST("21"),
    TWENTYSECOND("22"),
    TWENTYTHIRD("23"),
    TWENTYFOURTH("24"),
    TWENTYFIFTH("25"),
    TWENTYSIXTH("26"),
    TWENTYSEVENTH("27"),
    TWENTYEIGHTH("28"),
    TWENTYNINTH("29"),
    OVERTHIRTY("> 30");
    private final String name;

    FloorsOfHouse(String name) {
        this.name = name;
    }

    public static FloorsOfHouse fromString(String value) {
        for (FloorsOfHouse floorsOfHouse : FloorsOfHouse.values()) {
            if (floorsOfHouse.getName().equals(value)) {
                return floorsOfHouse;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
