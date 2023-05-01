package enums;

public enum WallMaterial {
    PANEL("Панельный"),
    MONOLITHIC("Монолитный"),
    BRICK("Кирпичный"),
    BLOCK("Блочный"),
    FRAME("Каркасный"),
    FRAMEBLOCK("Каркасно-блочный");
    private final String name;

    WallMaterial(String name) {
        this.name = name;
    }

    public static WallMaterial fromString(String value) {
        for (WallMaterial wallMaterial : WallMaterial.values()) {
            if (wallMaterial.getName().equals(value)) {
                return wallMaterial;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
