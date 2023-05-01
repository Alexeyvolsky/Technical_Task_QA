package enums;

public enum WindowsLookOut {
    TOTHEYARD("Во двор"),
    TOTHERIVER("На речку"),
    TOTHEPARK("В парк"),
    OUTSIDE("На улицу"),
    SOUTH("Юг"),
    NORTH("Север"),
    EAST("Восток"),
    WEST("Запад");
    private final String name;

    WindowsLookOut(String name) {
        this.name = name;
    }

    public static WindowsLookOut fromString(String value) {
        for (WindowsLookOut windowsLookOut : WindowsLookOut.values()) {
            if (windowsLookOut.getName().equals(value)) {
                return windowsLookOut;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
