package enums;

public enum Balcony {
    YES("Есть"), NO("Нет"), LOGGIA("Лоджия"), TWO("Два");
    private final String name;

    Balcony(String name) {
        this.name = name;
    }

    public static Balcony fromString(String value) {
        for (Balcony balcony : Balcony.values()) {
            if (balcony.getName().equals(value)) {
                return balcony;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
