package enums;

public enum Currency {
    BYR("р."), USD("$"), EUR("€");
    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public static Currency fromString(String value) {
        for (Currency currency : Currency.values()) {
            if (currency.getName().equals(value)) {
                return currency;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
