package enums;

public enum Deadline {
    ISDONE("Сдан"),
    FIRSTQUARTER("1 квартал 2023"),
    FSECONDQUARTER("2 квартал 2023"),
    THIRDQUARTER("3 квартал 2023"),
    FOURTHQUARTER("4 квартал 2023");
    private final String name;

    Deadline(String name) {
        this.name = name;
    }

    public static Deadline fromString(String value) {
        for (Deadline deadline : Deadline.values()) {
            if (deadline.getName().equals(value)) {
                return deadline;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
