package enums;

public enum NameOfTheResidentialComplex {
    MOD_HOUSE("MOD House"), GASTELLO_RESIDENCE("Гастелло Резиденс"), HOUSE_NUMBER_3_LOSHITSA_6("Дом №3 в мкр. Лошица-6"),
    HOUSE_NUMBER_3_GOGOL_PAPANIN("Дом № 3 по ул. Гоголя-Папанина"), HOUSE_NUMBER_4_PROLERIAN_SHCHORSA("Дом № 4 по ул. Пролетарской - Щорса");
    private final String name;

    NameOfTheResidentialComplex(String name) {
        this.name = name;
    }

    public static NameOfTheResidentialComplex fromString(String value) {
        for (NameOfTheResidentialComplex nameOfTheResidentialComplex : NameOfTheResidentialComplex.values()) {
            if (nameOfTheResidentialComplex.getName().equals(value)) {
                return nameOfTheResidentialComplex;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
