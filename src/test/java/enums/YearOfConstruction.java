package enums;

public enum YearOfConstruction {
    TWENTY25("2025"),
    TWENTY24("2024"),
    TWENTY23("2023"),
    TWENTY22("2022"),
    TWENTY21("2021"),
    TWENTY20("2020"),
    TWENTY19("2019"),
    TWENTY18("2018"),
    TWENTY17("2017"),
    TWENTY16("2016"),
    TWENTY15("2015"),
    TWENTY14("2014"),
    TWENTY13("2013"),
    TWENTY12("2012"),
    TWENTY11("2011"),
    TWENTY10("2010"),
    TWENTY09("2009"),
    TWENTY08("2008"),
    TWENTY07("2007"),
    TWENTY06("2006"),
    TWENTY05("2005"),
    TWENTY04("2004"),
    TWENTY03("2003"),
    TWENTY02("2002"),
    TWENTY01("2001");
    private final String name;

    YearOfConstruction(String name) {
        this.name = name;
    }

    public static YearOfConstruction fromString(String value) {
        for (YearOfConstruction yearOfConstruction : YearOfConstruction.values()) {
            if (yearOfConstruction.getName().equals(value)) {
                return yearOfConstruction;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
