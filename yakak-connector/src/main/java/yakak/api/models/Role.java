package yakak.api.models;

public enum Role {
    ADMIN("Administrator"),
    USER("Customer"),
    GUEST("Guest");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}