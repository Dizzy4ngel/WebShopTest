package eu.michaelclement.data;

public class UserFactory {
    public static User get(UserType type) {
        switch (type) {
            case VALID_USER -> {
                return new User("practiceUser", "practicePass");
            }
            case VALID_ADMIN -> {
                return new User("admin", "adminPass");
            }
            case INVALID -> {
                return new User("jkjkj", "kjkjk");
            }
            default -> throw new InvalidUserTypeException();
            }
        }
}
