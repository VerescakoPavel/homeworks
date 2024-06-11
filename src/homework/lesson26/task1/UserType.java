package homework.lesson26.task1;

//5*) Добавьте в enum поле, обозначающее название роли пользователя на русском языке
public enum UserType {
    USER("User"),
    ADMIN("Admin");

    private String roleName;

    UserType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
