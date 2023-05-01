package enums;

public enum DealType {
    SALE("Продажа"), RENT("Сдача");
    private final String name;

    DealType(String name) {
        this.name = name;
    }

    public static DealType fromString(String value) {
        for (DealType dealType : DealType.values()) {
            if (dealType.getName().equals(value)) {
                return dealType;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
