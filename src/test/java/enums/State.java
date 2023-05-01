package enums;

public enum State {
    New("Новое"),
    RESELLERS("Вторичное жилье");
    private final String name;

    State(String name) {
        this.name = name;
    }

    public static State fromString(String value) {
        for (State state : State.values()) {
            if (state.getName().equals(value)) {
                return state;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
